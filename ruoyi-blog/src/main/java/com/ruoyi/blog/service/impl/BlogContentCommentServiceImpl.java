package com.ruoyi.blog.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.blog.mapper.BlogContentCommentMapper;
import com.ruoyi.blog.domain.BlogContentComment;
import com.ruoyi.blog.service.IBlogContentCommentService;

/**
 * 【请填写功能名称】Service业务层处理
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
     * 查询【请填写功能名称】
     * 
     * @param contentId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public BlogContentComment selectBlogContentCommentById(Long contentId)
    {
        return blogContentCommentMapper.selectBlogContentCommentById(contentId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param blogContentComment 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BlogContentComment> selectBlogContentCommentList(BlogContentComment blogContentComment)
    {
        return blogContentCommentMapper.selectBlogContentCommentList(blogContentComment);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param blogContentComment 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBlogContentComment(BlogContentComment blogContentComment)
    {
        return blogContentCommentMapper.insertBlogContentComment(blogContentComment);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param blogContentComment 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBlogContentComment(BlogContentComment blogContentComment)
    {
        return blogContentCommentMapper.updateBlogContentComment(blogContentComment);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param contentIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteBlogContentCommentByIds(Long[] contentIds)
    {
        return blogContentCommentMapper.deleteBlogContentCommentByIds(contentIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param contentId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteBlogContentCommentById(Long contentId)
    {
        return blogContentCommentMapper.deleteBlogContentCommentById(contentId);
    }
}
