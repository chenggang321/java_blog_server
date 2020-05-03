package com.cg.blog.controller;

import com.cg.blog.common.R;
import com.cg.blog.dto.LoginDto;
import com.cg.blog.java_blog_service.UserService;
import com.cg.blog.pojo.User;
import com.cg.blog.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/*")
public class UserController extends BaseController<User> {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public R login(LoginVo loginVo){

        LoginDto loginDto = userService.login(loginVo.getUsername(),loginVo.getPassword());

        return R.success().data(loginDto);
    }
}
