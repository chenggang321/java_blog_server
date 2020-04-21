package com.cg.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.cg.blog.mapper")
public class JavaBlogDaoApplication {
    public static void main(String[] args) {
        SpringApplication.run(JavaBlogDaoApplication.class);
    }
}
