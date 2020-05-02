package com.cg.blog.controller;

import com.cg.blog.common.R;
import com.cg.blog.java_blog_service.impl.CategoryServiceImpl;
import com.cg.blog.java_blog_service.impl.UserServiceImpl;
import com.cg.blog.pojo.Category;
import com.cg.blog.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category/*")
public class CategoryController extends BaseController<Category> {

}
