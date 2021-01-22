package com.ruoyi.blog.service;

import java.util.List;
import com.ruoyi.blog.domain.BlogContent;

/**
 * 文章Service接口
 * 
 * @author chenggang
 * @date 2021-01-14
 */
public interface IBlogContentService 
{
    /**
     * 查询文章
     * 
     * @param id 文章ID
     * @return 文章
     */
    public BlogContent selectBlogContentById(Long id);

    /**
     * 查询文章列表
     * 
     * @param blogContent 文章
     * @return 文章集合
     */
    public List<BlogContent> selectBlogContentList(BlogContent blogContent);

    /**
     * 新增文章
     * 
     * @param blogContent 文章
     * @return 结果
     */
    public int insertBlogContent(BlogContent blogContent);

    /**
     * 修改文章
     * 
     * @param blogContent 文章
     * @return 结果
     */
    public int updateBlogContent(BlogContent blogContent);

    /**
     * 批量删除文章
     * 
     * @param ids 需要删除的文章ID
     * @return 结果
     */
    public int deleteBlogContentByIds(Long[] ids);

    /**
     * 删除文章信息
     * 
     * @param id 文章ID
     * @return 结果
     */
    public int deleteBlogContentById(Long id);
}
