package com.cg.blog.interceptor;

import com.cg.blog.annotation.CheckToken;
import com.cg.blog.annotation.LoginToken;
import com.cg.blog.java_blog_service.UserService;
import com.cg.blog.utils.CookiesUtils;
import com.cg.blog.utils.JwtUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

public class AuthenticationInterceptor implements HandlerInterceptor{

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private CookiesUtils cookiesUtils;

    @Autowired
    private UserService userService;

    public static final String ACCESS_TOKEN = "accessToken";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // 如果不是映射到方法直接通过
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();

        //检查是否有LoginToken注释，有则跳过认证
        if (method.isAnnotationPresent(LoginToken.class)) {
            LoginToken loginToken = method.getAnnotation(LoginToken.class);
            if (loginToken.required()) {
                return true;
            }
        }

        String accessToken = response.getHeader(ACCESS_TOKEN);
        if (StringUtils.isEmpty(accessToken)) {
            // 尝试从cookie取
            accessToken = cookiesUtils.getCookieValue(request,ACCESS_TOKEN);

        }
        if (StringUtils.isEmpty(accessToken)) {
            // 尝试参数里获取
            accessToken = request.getParameter(ACCESS_TOKEN);
        }

        //检查有没有需要用户权限的注解
        if (method.isAnnotationPresent(CheckToken.class)) {
            CheckToken checkToken = method.getAnnotation(CheckToken.class);
            if (checkToken.required()) {
                if (null == accessToken) {
                    throw new RuntimeException("无token，请重新登录");
                }
                boolean verify = jwtUtil.isVerify(accessToken);
                if(!verify){
                    throw new RuntimeException("非法访问！");
                }
                return true;
            }
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
