package com.cg.blog.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "content")
public class Content {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String title;
    private Date addTime;
    private int views;
    private String description;
    private String content;
    private Long categoryId;
    private Long userId;
}
