package com.ruoyi.blog.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.blog.mapper.BlogCommentMapper;
import com.ruoyi.blog.domain.BlogComment;
import com.ruoyi.blog.service.IBlogCommentService;

/**
 * 评论Service业务层处理
 * 
 * @author chenggang
 * @date 2021-01-18
 */
@Service
public class BlogCommentServiceImpl implements IBlogCommentService 
{
    @Autowired
    private BlogCommentMapper blogCommentMapper;

    @Override
    public BlogComment selectBlogCommentByComment(String comment) {
        return blogCommentMapper.selectBlogCommentByComment(comment);
    }

    /**
     * 查询评论
     * 
     * @param id 评论ID
     * @return 评论
     */
    @Override
    public BlogComment selectBlogCommentById(Long id)
    {
        return blogCommentMapper.selectBlogCommentById(id);
    }

    /**
     * 查询评论列表
     * 
     * @param blogComment 评论
     * @return 评论
     */
    @Override
    public List<BlogComment> selectBlogCommentList(BlogComment blogComment)
    {
        return blogCommentMapper.selectBlogCommentList(blogComment);
    }

    @Override
    public List<BlogComment> selectBlogCommentByContentId(Long contentId) {
        return blogCommentMapper.selectBlogCommentByContentId(contentId);
    }

    /**
     * 新增评论
     * 
     * @param blogComment 评论
     * @return 结果
     */
    @Override
    public int insertBlogComment(BlogComment blogComment)
    {
        return blogCommentMapper.insertBlogComment(blogComment);
    }

    /**
     * 修改评论
     * 
     * @param blogComment 评论
     * @return 结果
     */
    @Override
    public int updateBlogComment(BlogComment blogComment)
    {
        return blogCommentMapper.updateBlogComment(blogComment);
    }

    /**
     * 批量删除评论
     * 
     * @param ids 需要删除的评论ID
     * @return 结果
     */
    @Override
    public int deleteBlogCommentByIds(Long[] ids)
    {
        return blogCommentMapper.deleteBlogCommentByIds(ids);
    }

    /**
     * 删除评论信息
     * 
     * @param id 评论ID
     * @return 结果
     */
    @Override
    public int deleteBlogCommentById(Long id)
    {
        return blogCommentMapper.deleteBlogCommentById(id);
    }
}
