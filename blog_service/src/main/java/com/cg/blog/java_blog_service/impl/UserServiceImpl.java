package com.cg.blog.java_blog_service.impl;

import com.cg.blog.dto.LoginDto;
import com.cg.blog.java_blog_service.UserService;
import com.cg.blog.pojo.User;
import com.cg.blog.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public LoginDto login(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        User u = userService.get(user);

        Map<String,String> map = new HashMap<>(2);
        map.put("username",u.getUsername());
        map.put("password",u.getPassword());

        String token = jwtUtil.genToken(map);
        LoginDto loginDto =new LoginDto();
        loginDto.setUsername(username);
        loginDto.setToken(token);
        return loginDto;
    }
}
