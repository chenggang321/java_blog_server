package com.ruoyi.blog.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.blog.mapper.BlogContentMapper;
import com.ruoyi.blog.domain.BlogContent;
import com.ruoyi.blog.service.IBlogContentService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author chenggang
 * @date 2021-01-14
 */
@Service
public class BlogContentServiceImpl implements IBlogContentService 
{
    @Autowired
    private BlogContentMapper blogContentMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public BlogContent selectBlogContentById(Long id)
    {
        return blogContentMapper.selectBlogContentById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param blogContent 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BlogContent> selectBlogContentList(BlogContent blogContent)
    {
        return blogContentMapper.selectBlogContentList(blogContent);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param blogContent 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBlogContent(BlogContent blogContent)
    {
        return blogContentMapper.insertBlogContent(blogContent);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param blogContent 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBlogContent(BlogContent blogContent)
    {
        return blogContentMapper.updateBlogContent(blogContent);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteBlogContentByIds(Long[] ids)
    {
        return blogContentMapper.deleteBlogContentByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteBlogContentById(Long id)
    {
        return blogContentMapper.deleteBlogContentById(id);
    }
}
