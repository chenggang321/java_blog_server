package com.cg.blog.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class LoginVo {
    @NotNull(message = "不能为空!")
    private String username;
    @NotNull(message = "不能为空!")
    private String password;
}
