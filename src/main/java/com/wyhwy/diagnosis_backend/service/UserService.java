package com.wyhwy.diagnosis_backend.service;

import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.User;

import javax.servlet.http.HttpSession;

public interface UserService {
//    public User findByUsername(User user);
//
//    public User findUserById(Integer userId);

    User login(User user);
    User findById(Integer id);
    ResultPage<User> page(Integer current, Integer size);
    void create(User user);
    void update(User user);
    void del(Integer id);
}
