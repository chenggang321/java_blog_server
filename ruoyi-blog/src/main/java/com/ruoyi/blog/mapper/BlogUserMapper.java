package com.ruoyi.blog.mapper;

import java.util.List;
import com.ruoyi.blog.domain.BlogUser;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author chenggang
 * @date 2021-01-14
 */
public interface BlogUserMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public BlogUser selectBlogUserById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param blogUser 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BlogUser> selectBlogUserList(BlogUser blogUser);

    /**
     * 新增【请填写功能名称】
     * 
     * @param blogUser 【请填写功能名称】
     * @return 结果
     */
    public int insertBlogUser(BlogUser blogUser);

    /**
     * 修改【请填写功能名称】
     * 
     * @param blogUser 【请填写功能名称】
     * @return 结果
     */
    public int updateBlogUser(BlogUser blogUser);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteBlogUserById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBlogUserByIds(Long[] ids);
}
