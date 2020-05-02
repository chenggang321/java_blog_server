package com.cg.blog.controller;

import com.cg.blog.common.R;
import com.cg.blog.java_blog_service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class BaseController<T> {
    @Autowired
    private BaseService<T> baseService;

    @RequestMapping("list")
    public R list(T t){
        return R.success().data(baseService.list(t));
    }

    @RequestMapping("get")
    public R get(T t){
        return R.success().data(baseService.get(t));
    }

    @RequestMapping("update")
    public R update(T t){
        return R.success().data(baseService.update(t));
    }

    @RequestMapping("save")
    public R save(T t){
        return R.success().data(baseService.save(t));
    }

    @RequestMapping("delete")
    public R delete(T t){
        return R.success().data(baseService.delete(t));
    }
}
