package com.ruoyi.blog.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.blog.mapper.BlogContentCommentMapper;
import com.ruoyi.blog.domain.BlogContentComment;
import com.ruoyi.blog.service.IBlogContentCommentService;

/**
 * 文章评论Service业务层处理
 * 
 * @author chenggang
 * @date 2021-01-18
 */
@Service
public class BlogContentCommentServiceImpl implements IBlogContentCommentService 
{
    @Autowired
    private BlogContentCommentMapper blogContentCommentMapper;

    /**
     * 查询文章评论
     * 
     * @param contentId 文章评论ID
     * @return 文章评论
     */
    @Override
    public BlogContentComment selectBlogContentCommentById(Long contentId)
    {
        return blogContentCommentMapper.selectBlogContentCommentById(contentId);
    }

    /**
     * 查询文章评论列表
     * 
     * @param blogContentComment 文章评论
     * @return 文章评论
     */
    @Override
    public List<BlogContentComment> selectBlogContentCommentList(BlogContentComment blogContentComment)
    {
        return blogContentCommentMapper.selectBlogContentCommentList(blogContentComment);
    }

    /**
     * 新增文章评论
     * 
     * @param blogContentComment 文章评论
     * @return 结果
     */
    @Override
    public int insertBlogContentComment(BlogContentComment blogContentComment)
    {
        return blogContentCommentMapper.insertBlogContentComment(blogContentComment);
    }

    /**
     * 修改文章评论
     * 
     * @param blogContentComment 文章评论
     * @return 结果
     */
    @Override
    public int updateBlogContentComment(BlogContentComment blogContentComment)
    {
        return blogContentCommentMapper.updateBlogContentComment(blogContentComment);
    }

    /**
     * 批量删除文章评论
     * 
     * @param contentIds 需要删除的文章评论ID
     * @return 结果
     */
    @Override
    public int deleteBlogContentCommentByIds(Long[] contentIds)
    {
        return blogContentCommentMapper.deleteBlogContentCommentByIds(contentIds);
    }

    /**
     * 删除文章评论信息
     * 
     * @param contentId 文章评论ID
     * @return 结果
     */
    @Override
    public int deleteBlogContentCommentById(Long contentId)
    {
        return blogContentCommentMapper.deleteBlogContentCommentById(contentId);
    }
}
