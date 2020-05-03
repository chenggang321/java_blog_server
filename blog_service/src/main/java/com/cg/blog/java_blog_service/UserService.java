package com.cg.blog.java_blog_service;

import com.cg.blog.dto.LoginDto;
import com.cg.blog.pojo.User;

public interface UserService extends BaseService<User>{
    LoginDto login(String username, String password);
}
