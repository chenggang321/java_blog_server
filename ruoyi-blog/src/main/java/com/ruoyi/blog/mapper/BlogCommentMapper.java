package com.ruoyi.blog.mapper;

import java.util.List;
import com.ruoyi.blog.domain.BlogComment;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author chenggang
 * @date 2021-01-18
 */
public interface BlogCommentMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public BlogComment selectBlogCommentById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param blogComment 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BlogComment> selectBlogCommentList(BlogComment blogComment);

    /**
     * 新增【请填写功能名称】
     * 
     * @param blogComment 【请填写功能名称】
     * @return 结果
     */
    public int insertBlogComment(BlogComment blogComment);

    /**
     * 修改【请填写功能名称】
     * 
     * @param blogComment 【请填写功能名称】
     * @return 结果
     */
    public int updateBlogComment(BlogComment blogComment);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteBlogCommentById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBlogCommentByIds(Long[] ids);
}
