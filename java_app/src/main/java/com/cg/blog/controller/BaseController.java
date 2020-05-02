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
        try{
            return R.isOk().data(baseService.list(t));
        }catch (Exception e){
            return R.isFail(e);
        }

    }

    @RequestMapping("get")
    public R get(T t){
        try{
            return R.isOk().data(baseService.get(t));
        }catch (Exception e){
            return R.isFail(e);
        }
    }

    @RequestMapping("update")
    public R update(T t){
        return R.isOk().data(baseService.update(t));
    }

    @RequestMapping("save")
    public R save(T t){
        return R.isOk().data(baseService.save(t));
    }

    @RequestMapping("delete")
    public R delete(T t){
        return R.isOk().data(baseService.delete(t));
    }
}
