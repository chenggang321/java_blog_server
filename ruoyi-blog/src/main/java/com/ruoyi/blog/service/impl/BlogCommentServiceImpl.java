package com.ruoyi.blog.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.blog.mapper.BlogCommentMapper;
import com.ruoyi.blog.domain.BlogComment;
import com.ruoyi.blog.service.IBlogCommentService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author chenggang
 * @date 2021-01-18
 */
@Service
public class BlogCommentServiceImpl implements IBlogCommentService 
{
    @Autowired
    private BlogCommentMapper blogCommentMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public BlogComment selectBlogCommentById(Long id)
    {
        return blogCommentMapper.selectBlogCommentById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param blogComment 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BlogComment> selectBlogCommentList(BlogComment blogComment)
    {
        return blogCommentMapper.selectBlogCommentList(blogComment);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param blogComment 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBlogComment(BlogComment blogComment)
    {
        return blogCommentMapper.insertBlogComment(blogComment);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param blogComment 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBlogComment(BlogComment blogComment)
    {
        return blogCommentMapper.updateBlogComment(blogComment);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteBlogCommentByIds(Long[] ids)
    {
        return blogCommentMapper.deleteBlogCommentByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteBlogCommentById(Long id)
    {
        return blogCommentMapper.deleteBlogCommentById(id);
    }
}
