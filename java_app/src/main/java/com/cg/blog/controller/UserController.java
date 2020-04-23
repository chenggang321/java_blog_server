package com.cg.blog.controller;

import com.cg.blog.common.R;
import com.cg.blog.java_blog_service.impl.UserServiceImpl;
import com.cg.blog.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/*")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("list")
    public R list(User user){
        return R.isOk().data(userService.list(user));
    }
}
