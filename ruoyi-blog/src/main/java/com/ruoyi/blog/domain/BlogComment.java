package com.ruoyi.blog.domain;

import com.ruoyi.common.core.domain.entity.SysUser;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 评论对象 blog_comment
 *
 * @author chenggang
 * @date 2021-01-18
 */
public class BlogComment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 评论 */
    @Excel(name = "评论")
    private String comment;

    /** 文章关联id */
    @Excel(name = "文章关联id")
    private Long contentId;

    /** $column.columnComment */
    private Long userId;

    public Long getUserId() {
        return userId;
    }

    private SysUser user;

    public SysUser getUser() {
        return user;
    }

    public void setUser(SysUser user) {
        this.user = user;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    public String getComment()
    {
        return comment;
    }

    @Override
    public String toString() {
        return "BlogComment{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", contentId=" + contentId +
                '}';
    }
}
