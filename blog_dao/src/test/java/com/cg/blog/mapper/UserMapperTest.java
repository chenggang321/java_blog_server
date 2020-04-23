package com.cg.blog.mapper;

import com.cg.blog.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void createUser(){
        User user = new User();
        user.setUsername("username");
        user.setPassword("password");
        user.setIsAdmin(false);
        userMapper.insert(user);
    }

    @Test
    public void selectUser(){
        List<User> users = userMapper.selectAll();
        System.out.println(users.toString());
    }
}