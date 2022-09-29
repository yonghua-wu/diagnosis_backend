package com.wyhwy.diagnosis_backend.service.impl;


import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.User;
import com.wyhwy.diagnosis_backend.mapper.UserMapper;
import com.wyhwy.diagnosis_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public User login(User user) {
        User userDB = userMapper.login(user);
        System.out.println("userDB: "+ userDB);
        if(userDB != null) {
//                System.out.println("用户名或密码错误");
//                session.setAttribute("msg", "用户名或密码错误");
            return userDB;
        }

        throw new RuntimeException("登录失败 =_= ");
    }
    public User findById(Integer id) {
        System.out.println("id: "+ id);
        return userMapper.findById(id);
    }
    public ResultPage<User> page(Integer current, Integer size) {
        List<User> list = userMapper.select((current - 1) * size, size);
        int count = userMapper.count();
        ResultPage<User> page = new ResultPage<>(current, size, count, list);
        return page;
    }
    public void create(User User) {
        userMapper.create(User);
    }
    public void update(User User) {
        userMapper.update(User);
    }
    public void del(Integer id) {
        userMapper.del(id);
    }

}
