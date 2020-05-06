package com.cg.blog.common;

import lombok.Data;

import java.io.Serializable;
@Data
public class R<T> implements Serializable{

    private static final long serialVersionUID = -1888460129599891430L;
    private static final Boolean OK = true;
    private static final Boolean FAIL = false;
    private static final int UNAUTHORIZED = 2;

    private T data; //服务端数据
    private Boolean success = OK; // 是否成功
    private Number code; // 状态码
    private String message = ""; // 描述信息

    public static R success() {
        return new R();
    }

    public static R error() {
        return new R().success(FAIL);
    }

    public static R error(Throwable e) {
        return error().message(e);
    }

    public static R error(Number code ,Throwable e) {
        return error().message(code,e);
    }

    public static R error(Number code, String message){
        return error().message(code,message);
    }

    public static R error(String message) {
        return error().message(message);
    }

    public R message(Throwable e) {
        this.setMessage(e.toString());
        return this;
    }

    public R message(Number code,Throwable e){
        return this.message(code,e.toString());
    }

    public R message(Number code,String message){
        this.setCode(code);
        this.setMessage(message);
        return this;
    }

    public R message(String message){
        this.setMessage(message);
        return this;
    }

    public R data(T data) {
        this.setData(data);
        return this;
    }

    public R success(Boolean success) {
        this.setSuccess(success);
        return this;
    }
}
