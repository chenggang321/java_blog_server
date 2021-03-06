package com.ruoyi.blog.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import com.ruoyi.common.core.domain.entity.SysUser;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 文章对象 blog_content
 *
 * @author chenggang
 * @date 2021-01-14
 */
public class BlogContent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 文章标题 */
    @Excel(name = "文章标题")
    private String title;

    /** 添加时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "添加时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date addTime;

    /** 阅读量 */
    @Excel(name = "阅读量")
    private Long views;

    /** 文章简介 */
    @Excel(name = "文章简介")
    private String description;

    /** 文章内容 */
    @Excel(name = "文章内容")
    private String content;

    /** 分类关联表id */
    @Excel(name = "分类关联表id")
    private Long categoryId;

    /** 用户关联表id */
    @Excel(name = "用户关联表id")
    private Long userId;

    private SysUser user;

    private List<BlogComment> comments;

    public List<BlogComment> getComments() {
        return comments;
    }

    public void setComments(List<BlogComment> comments) {
        this.comments = comments;
    }

    public SysUser getUser() {
        return user;
    }

    public void setUser(SysUser user) {
        this.user = user;
    }

    private BlogCategory category;

    public BlogCategory getCategory() {
        return category;
    }

    public void setCategory(BlogCategory category) {
        this.category = category;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }
    public void setAddTime(Date addTime)
    {
        this.addTime = addTime;
    }

    public Date getAddTime()
    {
        return addTime;
    }
    public void setViews(Long views)
    {
        this.views = views;
    }

    public Long getViews()
    {
        return views;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }

    public void setCategoryId(Long categoryId)
    {
        this.categoryId = categoryId;
    }

    public Long getCategoryId()
    {
        return categoryId;
    }
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }

    @Override
    public String toString() {
        return "BlogContent{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", addTime=" + addTime +
                ", views=" + views +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", categoryId=" + categoryId +
                ", userId=" + userId +
                ", user=" + user +
                ", comments=" + comments +
                ", category=" + category +
                '}';
    }
}
