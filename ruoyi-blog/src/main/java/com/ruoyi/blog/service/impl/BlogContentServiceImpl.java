package com.ruoyi.blog.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.blog.mapper.BlogContentMapper;
import com.ruoyi.blog.domain.BlogContent;
import com.ruoyi.blog.service.IBlogContentService;

/**
 * 文章Service业务层处理
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
     * 查询文章
     * 
     * @param id 文章ID
     * @return 文章
     */
    @Override
    public BlogContent selectBlogContentById(Long id)
    {
        return blogContentMapper.selectBlogContentById(id);
    }

    /**
     * 查询文章列表
     * 
     * @param blogContent 文章
     * @return 文章
     */
    @Override
    public List<BlogContent> selectBlogContentList(BlogContent blogContent)
    {
        return blogContentMapper.selectBlogContentList(blogContent);
    }

    /**
     * 新增文章
     * 
     * @param blogContent 文章
     * @return 结果
     */
    @Override
    public int insertBlogContent(BlogContent blogContent)
    {
        return blogContentMapper.insertBlogContent(blogContent);
    }

    /**
     * 修改文章
     * 
     * @param blogContent 文章
     * @return 结果
     */
    @Override
    public int updateBlogContent(BlogContent blogContent)
    {
        return blogContentMapper.updateBlogContent(blogContent);
    }

    /**
     * 批量删除文章
     * 
     * @param ids 需要删除的文章ID
     * @return 结果
     */
    @Override
    public int deleteBlogContentByIds(Long[] ids)
    {
        return blogContentMapper.deleteBlogContentByIds(ids);
    }

    /**
     * 删除文章信息
     * 
     * @param id 文章ID
     * @return 结果
     */
    @Override
    public int deleteBlogContentById(Long id)
    {
        return blogContentMapper.deleteBlogContentById(id);
    }
}
