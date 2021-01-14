package com.ruoyi.blog.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.blog.mapper.BlogCategoryMapper;
import com.ruoyi.blog.domain.BlogCategory;
import com.ruoyi.blog.service.IBlogCategoryService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author chenggang
 * @date 2021-01-14
 */
@Service
public class BlogCategoryServiceImpl implements IBlogCategoryService 
{
    @Autowired
    private BlogCategoryMapper blogCategoryMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public BlogCategory selectBlogCategoryById(Long id)
    {
        return blogCategoryMapper.selectBlogCategoryById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param blogCategory 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BlogCategory> selectBlogCategoryList(BlogCategory blogCategory)
    {
        return blogCategoryMapper.selectBlogCategoryList(blogCategory);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param blogCategory 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBlogCategory(BlogCategory blogCategory)
    {
        return blogCategoryMapper.insertBlogCategory(blogCategory);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param blogCategory 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBlogCategory(BlogCategory blogCategory)
    {
        return blogCategoryMapper.updateBlogCategory(blogCategory);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteBlogCategoryByIds(Long[] ids)
    {
        return blogCategoryMapper.deleteBlogCategoryByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteBlogCategoryById(Long id)
    {
        return blogCategoryMapper.deleteBlogCategoryById(id);
    }
}
