package com.cg.blog.controller;

import com.cg.blog.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestCtrlExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.OK)
    public R handleException(Exception e) {
        return R.error(e);
    }
}
