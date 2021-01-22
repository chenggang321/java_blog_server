package com.ruoyi.blog.service;

import java.util.List;
import com.ruoyi.blog.domain.BlogContentComment;

/**
 * 文章评论Service接口
 * 
 * @author chenggang
 * @date 2021-01-18
 */
public interface IBlogContentCommentService 
{
    /**
     * 查询文章评论
     * 
     * @param contentId 文章评论ID
     * @return 文章评论
     */
    public BlogContentComment selectBlogContentCommentById(Long contentId);

    /**
     * 查询文章评论列表
     * 
     * @param blogContentComment 文章评论
     * @return 文章评论集合
     */
    public List<BlogContentComment> selectBlogContentCommentList(BlogContentComment blogContentComment);

    /**
     * 新增文章评论
     * 
     * @param blogContentComment 文章评论
     * @return 结果
     */
    public int insertBlogContentComment(BlogContentComment blogContentComment);

    /**
     * 修改文章评论
     * 
     * @param blogContentComment 文章评论
     * @return 结果
     */
    public int updateBlogContentComment(BlogContentComment blogContentComment);

    /**
     * 批量删除文章评论
     * 
     * @param contentIds 需要删除的文章评论ID
     * @return 结果
     */
    public int deleteBlogContentCommentByIds(Long[] contentIds);

    /**
     * 删除文章评论信息
     * 
     * @param contentId 文章评论ID
     * @return 结果
     */
    public int deleteBlogContentCommentById(Long contentId);
}
