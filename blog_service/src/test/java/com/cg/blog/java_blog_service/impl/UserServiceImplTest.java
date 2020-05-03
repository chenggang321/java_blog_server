package com.cg.blog.java_blog_service.impl;

import com.cg.blog.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserServiceImpl userService;

    @Test
    public void queryUserList() {
        List<User> users = userService.list(new User());
        System.out.println(users);
    }

    @Test
    public void queryUserById() {
        User user = new User();
        user.setId(1l);
        User suser = userService.get(user);
        System.out.println(suser);
    }

    @Test
    public void insertUser() {
        User user = new User();
        user.setUsername("aaaa");
        user.setPassword("bbbb");
        user.setIsAdmin(true);
        userService.save(user);
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setId(1l);
        user.setUsername("test");
        user.setPassword("123456");
        user.setIsAdmin(true);
        userService.update(user);
    }

    @Test
    public void deleteUseById() {
        User user = new User();
        user.setId(9l);
        userService.delete(user);
    }

    @Test
    public void login() {
        userService.login("test","123456");
    }
}