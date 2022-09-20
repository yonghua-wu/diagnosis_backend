package com.wyhwy.diagnosis_backend.service;

import com.wyhwy.diagnosis_backend.domain.User;
import com.wyhwy.diagnosis_backend.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;
    public User findByUsername(User user){
        return userMapper.findByUsername(user.getUsername());
    }
    public User findUserById(Integer userId){
        return userMapper.findUserById(userId);
    }

}
