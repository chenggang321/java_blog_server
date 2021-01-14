package com.ruoyi.blog.service;

import java.util.List;
import com.ruoyi.blog.domain.BlogCategory;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author chenggang
 * @date 2021-01-14
 */
public interface IBlogCategoryService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public BlogCategory selectBlogCategoryById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param blogCategory 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BlogCategory> selectBlogCategoryList(BlogCategory blogCategory);

    /**
     * 新增【请填写功能名称】
     * 
     * @param blogCategory 【请填写功能名称】
     * @return 结果
     */
    public int insertBlogCategory(BlogCategory blogCategory);

    /**
     * 修改【请填写功能名称】
     * 
     * @param blogCategory 【请填写功能名称】
     * @return 结果
     */
    public int updateBlogCategory(BlogCategory blogCategory);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteBlogCategoryByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteBlogCategoryById(Long id);
}
