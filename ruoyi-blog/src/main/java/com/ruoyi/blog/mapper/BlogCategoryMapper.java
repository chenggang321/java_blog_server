package com.ruoyi.blog.mapper;

import java.util.List;
import com.ruoyi.blog.domain.BlogCategory;

/**
 * 分类Mapper接口
 * 
 * @author chenggang
 * @date 2021-01-14
 */
public interface BlogCategoryMapper 
{
    /**
     * 查询分类
     * 
     * @param id 分类ID
     * @return 分类
     */
    public BlogCategory selectBlogCategoryById(Long id);

    /**
     * 查询分类列表
     * 
     * @param blogCategory 分类
     * @return 分类集合
     */
    public List<BlogCategory> selectBlogCategoryList(BlogCategory blogCategory);

    /**
     * 新增分类
     * 
     * @param blogCategory 分类
     * @return 结果
     */
    public int insertBlogCategory(BlogCategory blogCategory);

    /**
     * 修改分类
     * 
     * @param blogCategory 分类
     * @return 结果
     */
    public int updateBlogCategory(BlogCategory blogCategory);

    /**
     * 删除分类
     * 
     * @param id 分类ID
     * @return 结果
     */
    public int deleteBlogCategoryById(Long id);

    /**
     * 批量删除分类
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBlogCategoryByIds(Long[] ids);
}
