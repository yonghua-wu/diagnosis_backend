package com.wyhwy.diagnosis_backend.interceptors.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.MethodParameter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import com.wyhwy.diagnosis_backend.domain.UserLoginInfo;

@Component
public class LoginUserArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        Class<?> clazz = parameter.getParameterType();
        return clazz==UserLoginInfo.class;
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, @Nullable ModelAndViewContainer mavContainer, NativeWebRequest webRequest, @Nullable WebDataBinderFactory binderFactory) throws Exception {
        HttpServletRequest request = webRequest.getNativeRequest(HttpServletRequest.class);
        HttpServletResponse response = webRequest.getNativeResponse(HttpServletResponse.class);
        String token = request.getParameter("token");
        System.out.println(token);
        JWTUtils.getTokenInfo(token);
        // 然后根据token获取用户登录信息，这里省略获取用户信息的过程，随便填写一些数据
        UserLoginInfo loginUser = new UserLoginInfo();
        loginUser.setId(1);
        // loginUser.setUsername("lizhencheng");
        // return loginUser;
        return loginUser;
    }

    // @Override
    // @Nullable
    // public Object resolveArgument(MethodParameter arg0, @Nullable ModelAndViewContainer arg1, NativeWebRequest arg2,
    //         @Nullable WebDataBinderFactory arg3) throws Exception {
    //     // TODO Auto-generated method stub
    //     return null;
    // }
}
