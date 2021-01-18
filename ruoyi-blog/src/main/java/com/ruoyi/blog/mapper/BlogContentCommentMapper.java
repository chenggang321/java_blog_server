package com.ruoyi.blog.mapper;

import java.util.List;
import com.ruoyi.blog.domain.BlogContentComment;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author chenggang
 * @date 2021-01-18
 */
public interface BlogContentCommentMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param contentId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public BlogContentComment selectBlogContentCommentById(Long contentId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param blogContentComment 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BlogContentComment> selectBlogContentCommentList(BlogContentComment blogContentComment);

    /**
     * 新增【请填写功能名称】
     * 
     * @param blogContentComment 【请填写功能名称】
     * @return 结果
     */
    public int insertBlogContentComment(BlogContentComment blogContentComment);

    /**
     * 修改【请填写功能名称】
     * 
     * @param blogContentComment 【请填写功能名称】
     * @return 结果
     */
    public int updateBlogContentComment(BlogContentComment blogContentComment);

    /**
     * 删除【请填写功能名称】
     * 
     * @param contentId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteBlogContentCommentById(Long contentId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param contentIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteBlogContentCommentByIds(Long[] contentIds);
}
