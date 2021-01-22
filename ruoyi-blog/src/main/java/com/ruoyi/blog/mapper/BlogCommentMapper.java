package com.ruoyi.blog.mapper;

import java.util.List;
import com.ruoyi.blog.domain.BlogComment;

/**
 * 评论Mapper接口
 * 
 * @author chenggang
 * @date 2021-01-18
 */
public interface BlogCommentMapper 
{
    /**
     * 查询评论
     *
     * @param comment 评论ID
     * @return 评论
     */
    public BlogComment selectBlogCommentByComment(String comment);

    /**
     * 查询评论
     * 
     * @param id 评论ID
     * @return 评论
     */
    public BlogComment selectBlogCommentById(Long id);

    /**
     * 查询评论列表
     * 
     * @param blogComment 评论
     * @return 评论集合
     */
    public List<BlogComment> selectBlogCommentList(BlogComment blogComment);

    /**
     * 新增评论
     * 
     * @param blogComment 评论
     * @return 结果
     */
    public int insertBlogComment(BlogComment blogComment);

    /**
     * 修改评论
     * 
     * @param blogComment 评论
     * @return 结果
     */
    public int updateBlogComment(BlogComment blogComment);

    /**
     * 删除评论
     * 
     * @param id 评论ID
     * @return 结果
     */
    public int deleteBlogCommentById(Long id);

    /**
     * 批量删除评论
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBlogCommentByIds(Long[] ids);
}
