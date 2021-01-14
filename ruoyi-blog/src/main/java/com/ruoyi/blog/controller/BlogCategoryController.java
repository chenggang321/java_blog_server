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
import com.ruoyi.blog.domain.BlogCategory;
import com.ruoyi.blog.service.IBlogCategoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 分类 Controller
 *
 * @author chenggang
 * @date 2021-01-14
 */
@Api("分类")
@RestController
@RequestMapping("/blog/category")
public class BlogCategoryController extends BaseController
{
    @Autowired
    private IBlogCategoryService blogCategoryService;

    /**
     * 查询分类列表
     */
    @ApiOperation("查询分类列表")
    @PreAuthorize("@ss.hasPermi('blog:category:list')")
    @GetMapping("/list")
    public TableDataInfo list(BlogCategory blogCategory)
    {
        startPage();
        List<BlogCategory> list = blogCategoryService.selectBlogCategoryList(blogCategory);
        return getDataTable(list);
    }

    /**
     * 导出分类列表列表
     */
    @ApiOperation("导出分类列表列表")
    @PreAuthorize("@ss.hasPermi('blog:category:export')")
    @Log(title = "导出分类列表列表", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(BlogCategory blogCategory)
    {
        List<BlogCategory> list = blogCategoryService.selectBlogCategoryList(blogCategory);
        ExcelUtil<BlogCategory> util = new ExcelUtil<BlogCategory>(BlogCategory.class);
        return util.exportExcel(list, "category");
    }

    /**
     * 获取分类详细信息
     */
    @ApiOperation("获取分类详细信息")
    @PreAuthorize("@ss.hasPermi('blog:category:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(blogCategoryService.selectBlogCategoryById(id));
    }

    /**
     * 新增分类
     */
    @ApiOperation("新增分类")
    @PreAuthorize("@ss.hasPermi('blog:category:add')")
    @Log(title = "新增分类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BlogCategory blogCategory)
    {
        return toAjax(blogCategoryService.insertBlogCategory(blogCategory));
    }

    /**
     * 修改分类
     */
    @ApiOperation("修改分类")
    @PreAuthorize("@ss.hasPermi('blog:category:edit')")
    @Log(title = "修改分类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BlogCategory blogCategory)
    {
        return toAjax(blogCategoryService.updateBlogCategory(blogCategory));
    }

    /**
     * 删除分类
     */
    @ApiOperation("删除分类")
    @PreAuthorize("@ss.hasPermi('blog:category:remove')")
    @Log(title = "删除分类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(blogCategoryService.deleteBlogCategoryByIds(ids));
    }
}
