package com.ruoyi.blog.controller;

import java.util.Date;
import java.util.List;

import com.ruoyi.blog.domain.BlogContentComment;
import com.ruoyi.blog.service.IBlogContentCommentService;
import com.ruoyi.blog.service.IBlogContentService;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.utils.ServletUtils;
import com.ruoyi.framework.web.service.TokenService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.blog.domain.BlogComment;
import com.ruoyi.blog.service.IBlogCommentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 评论Controller
 * 
 * @author chenggang
 * @date 2021-01-18
 */
@RestController
@RequestMapping("/blog/comment")
public class BlogCommentController extends BaseController
{
    @Autowired
    private IBlogCommentService blogCommentService;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private IBlogContentCommentService blogContentCommentService;

    @PostMapping("/addContentComment/{id}")
    public AjaxResult addContentCommentByUser(@RequestBody BlogComment blogComment,@PathVariable("id") Long id){
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        SysUser user = loginUser.getUser();
        blogComment.setCreateBy(user.getNickName());
        blogComment.setCreateTime(new Date());
        // 新增评论
        blogCommentService.insertBlogComment(blogComment);
        BlogComment blogComment1 = blogCommentService.selectBlogCommentByComment(blogComment.getComment());

        BlogContentComment blogContentComment = new BlogContentComment();
        blogContentComment.setCommentId(blogComment1.getId());
        blogContentComment.setContentId(id);
        // 添加文章评论关联
        blogContentCommentService.insertBlogContentComment(blogContentComment);
        return AjaxResult.success();
    }
    
    /**
     * 查询评论列表
     */
    @PreAuthorize("@ss.hasPermi('blog:comment:list')")
    @GetMapping("/list")
    public TableDataInfo list(BlogComment blogComment)
    {
        startPage();
        List<BlogComment> list = blogCommentService.selectBlogCommentList(blogComment);
        return getDataTable(list);
    }

    /**
     * 导出评论列表
     */
    @PreAuthorize("@ss.hasPermi('blog:comment:export')")
    @Log(title = "评论", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(BlogComment blogComment)
    {
        List<BlogComment> list = blogCommentService.selectBlogCommentList(blogComment);
        ExcelUtil<BlogComment> util = new ExcelUtil<BlogComment>(BlogComment.class);
        return util.exportExcel(list, "comment");
    }

    /**
     * 获取评论详细信息
     */
    @PreAuthorize("@ss.hasPermi('blog:comment:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(blogCommentService.selectBlogCommentById(id));
    }

    /**
     * 新增评论
     */
    @PreAuthorize("@ss.hasPermi('blog:comment:add')")
    @Log(title = "评论", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BlogComment blogComment)
    {
        return toAjax(blogCommentService.insertBlogComment(blogComment));
    }

    /**
     * 修改评论
     */
    @PreAuthorize("@ss.hasPermi('blog:comment:edit')")
    @Log(title = "评论", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BlogComment blogComment)
    {
        return toAjax(blogCommentService.updateBlogComment(blogComment));
    }

    /**
     * 删除评论
     */
    @PreAuthorize("@ss.hasPermi('blog:comment:remove')")
    @Log(title = "评论", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(blogCommentService.deleteBlogCommentByIds(ids));
    }
}
