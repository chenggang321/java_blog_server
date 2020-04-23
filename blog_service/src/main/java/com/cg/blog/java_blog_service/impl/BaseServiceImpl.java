package com.cg.blog.java_blog_service.impl;

import com.cg.blog.java_blog_service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    private Mapper<T> mapper;

    @Override
    public List<T> list(T pojo) {
        return mapper.select(pojo);
    }

    @Override
    public T get(T pojo) {
        return mapper.selectOne(pojo);
    }

    @Override
    public int update(T pojo) {
        return mapper.updateByPrimaryKeySelective(pojo);
    }

    @Override
    public int save(T pojo) {
        return mapper.insertSelective(pojo);
    }

    @Override
    public int delete(T pojo) {
        return mapper.deleteByPrimaryKey(pojo);
    }
}
