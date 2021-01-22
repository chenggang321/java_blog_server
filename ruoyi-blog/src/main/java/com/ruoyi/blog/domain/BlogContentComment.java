package com.ruoyi.blog.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 文章评论对象 blog_content_comment
 * 
 * @author chenggang
 * @date 2021-01-18
 */
public class BlogContentComment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 文章id */
    private Long contentId;

    /** 评论id */
    private Long commentId;

    public void setContentId(Long contentId) 
    {
        this.contentId = contentId;
    }

    public Long getContentId() 
    {
        return contentId;
    }
    public void setCommentId(Long commentId) 
    {
        this.commentId = commentId;
    }

    public Long getCommentId() 
    {
        return commentId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("contentId", getContentId())
            .append("commentId", getCommentId())
            .toString();
    }
}
