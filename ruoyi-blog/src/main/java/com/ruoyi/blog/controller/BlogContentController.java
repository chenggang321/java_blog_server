package com.ruoyi.blog.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
import com.ruoyi.blog.domain.BlogContent;
import com.ruoyi.blog.service.IBlogContentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 文章 Controller
 * 
 * @author chenggang
 * @date 2021-01-14
 */
@Api("文章")
@RestController
@RequestMapping("/blog/content")
public class BlogContentController extends BaseController
{
    @Autowired
    private IBlogContentService blogContentService;

    /**
     * 查询文章列表
     */
    @ApiOperation("查询文章列表")
    // @PreAuthorize("@ss.hasPermi('blog:content:list')")
    @GetMapping("/list")
    public TableDataInfo list(BlogContent blogContent)
    {
        startPage();
        List<BlogContent> list = blogContentService.selectBlogContentList(blogContent);
        return getDataTable(list);
    }

    /**
     * 导出文章列表
     */
    @ApiOperation("导出文章列表")
    @PreAuthorize("@ss.hasPermi('blog:content:export')")
    @Log(title = "导出文章列表", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(BlogContent blogContent)
    {
        List<BlogContent> list = blogContentService.selectBlogContentList(blogContent);
        ExcelUtil<BlogContent> util = new ExcelUtil<BlogContent>(BlogContent.class);
        return util.exportExcel(list, "content");
    }

    /**
     * 获取文章详细信息
     */
    @ApiOperation("获取文章详细信息")
    // @PreAuthorize("@ss.hasPermi('blog:content:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(blogContentService.selectBlogContentById(id));
    }

    /**
     * 新增文章
     */
    @ApiOperation("新增文章")
    @PreAuthorize("@ss.hasPermi('blog:content:add')")
    @Log(title = "新增文章", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BlogContent blogContent)
    {
        return toAjax(blogContentService.insertBlogContent(blogContent));
    }

    /**
     * 修改文章
     */
    @ApiOperation("修改文章")
    @PreAuthorize("@ss.hasPermi('blog:content:edit')")
    @Log(title = "修改文章", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BlogContent blogContent)
    {
        return toAjax(blogContentService.updateBlogContent(blogContent));
    }

    /**
     * 删除文章
     */
    @ApiOperation("删除文章")
    @PreAuthorize("@ss.hasPermi('blog:content:remove')")
    @Log(title = "删除文章", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(blogContentService.deleteBlogContentByIds(ids));
    }
}
