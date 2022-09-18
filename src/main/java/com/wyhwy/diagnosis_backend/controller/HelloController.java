package com.wyhwy.diagnosis_backend.controller;

import com.wyhwy.diagnosis_backend.mapper.UserMapper;
import com.wyhwy.diagnosis_backend.service.ResponesBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/api")
//public class HelloController {
//    @Autowired
//    private UserMapper userMapper;
//
//    @GetMapping("/hello/{id}")
//    public ResponesBase hello(@PathVariable("id") int id) {
//        User userInfo = userMapper.selectById(id);
//
//        System.out.printf(userInfo.getUsername());
//
////        User insertUserInfo = new User("wuyonghua", "123456", "17307359471", 1);
//
////        userMapper.insert(insertUserInfo);
//        ResponesBase res = new ResponesBase<User>();
//        res.setCode(200);
//        res.setMsg("ok");
//        res.setData(userInfo);
//        return res;
//    }
//}
