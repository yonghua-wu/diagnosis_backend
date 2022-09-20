package com.wyhwy.diagnosis_backend.service.impl;


import com.wyhwy.diagnosis_backend.domain.User;
import com.wyhwy.diagnosis_backend.mapper.UserMapper;
import com.wyhwy.diagnosis_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

//    @Override
//    public User findByUsername(User user) {
//        return userMapper.findByUsername(user.getUsername());
//    }
//
//    @Override
//    public User findUserById(Integer userId) {
//        return userMapper.findUserById(userId);
//    }

    @Override
    public void login(User user) {
        try {
            Integer id = userMapper.login(user);
            if(id == null){
                System.out.println("用户名或密码错误");
//                session.setAttribute("msg", "用户名或密码错误");
            }else{
                System.out.println(id);
//                session.setAttribute("msg", "登录成功");
            }
        }catch (Exception e){
//            session.getAttribute(e.getMessage());
            e.printStackTrace();
            throw e;
        }

    }

}
