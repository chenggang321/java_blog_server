package com.ruoyi.blog.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.blog.mapper.BlogUserMapper;
import com.ruoyi.blog.domain.BlogUser;
import com.ruoyi.blog.service.IBlogUserService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author chenggang
 * @date 2021-01-14
 */
@Service
public class BlogUserServiceImpl implements IBlogUserService 
{
    @Autowired
    private BlogUserMapper blogUserMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public BlogUser selectBlogUserById(Long id)
    {
        return blogUserMapper.selectBlogUserById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param blogUser 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BlogUser> selectBlogUserList(BlogUser blogUser)
    {
        return blogUserMapper.selectBlogUserList(blogUser);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param blogUser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBlogUser(BlogUser blogUser)
    {
        return blogUserMapper.insertBlogUser(blogUser);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param blogUser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBlogUser(BlogUser blogUser)
    {
        return blogUserMapper.updateBlogUser(blogUser);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteBlogUserByIds(Long[] ids)
    {
        return blogUserMapper.deleteBlogUserByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteBlogUserById(Long id)
    {
        return blogUserMapper.deleteBlogUserById(id);
    }
}
