package com.ruoyi.blog.mapper;

import java.util.List;
import com.ruoyi.blog.domain.BlogUser;

/**
 * 用户Mapper接口
 * 
 * @author chenggang
 * @date 2021-01-14
 */
public interface BlogUserMapper 
{
    /**
     * 查询用户
     * 
     * @param id 用户ID
     * @return 用户
     */
    public BlogUser selectBlogUserById(Long id);

    /**
     * 查询用户列表
     * 
     * @param blogUser 用户
     * @return 用户集合
     */
    public List<BlogUser> selectBlogUserList(BlogUser blogUser);

    /**
     * 新增用户
     * 
     * @param blogUser 用户
     * @return 结果
     */
    public int insertBlogUser(BlogUser blogUser);

    /**
     * 修改用户
     * 
     * @param blogUser 用户
     * @return 结果
     */
    public int updateBlogUser(BlogUser blogUser);

    /**
     * 删除用户
     * 
     * @param id 用户ID
     * @return 结果
     */
    public int deleteBlogUserById(Long id);

    /**
     * 批量删除用户
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBlogUserByIds(Long[] ids);
}
