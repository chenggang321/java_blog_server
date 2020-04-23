package com.cg.blog.java_blog_service;

import java.util.List;

public interface BaseService<T> {
    List<T> list(T pojo);

    T get(T pojo);

    int update(T pojo);

    int save(T pojo);

    int delete(T pojo);
}
