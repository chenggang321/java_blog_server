package com.cg.blog.mapper;

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
public class HandUserMapperTest {

    @Autowired
    private HandUserMapper handUserMapper;

    @Test
    public void selectUser() {
        List<User> users = handUserMapper.selectUser();
        System.out.println(users.toString());
    }
}