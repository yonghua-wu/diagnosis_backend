package com.wyhwy.diagnosis_backend.service;

import com.wyhwy.diagnosis_backend.domain.User;

import javax.servlet.http.HttpSession;

public interface UserService {
//    public User findByUsername(User user);
//
//    public User findUserById(Integer userId);

    User login(User user);
}
