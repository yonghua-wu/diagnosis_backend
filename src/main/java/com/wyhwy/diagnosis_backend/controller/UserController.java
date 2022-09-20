package com.wyhwy.diagnosis_backend.controller;

import com.wyhwy.diagnosis_backend.domain.User;
import com.wyhwy.diagnosis_backend.service.UserService;
import org.apache.catalina.session.StandardSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import java.util.Enumeration;

//@RestController  @RestController是@ResponseBody和@Controller的组合注解

@RestController
@RequestMapping("/login")
public class  UserController{

    @Autowired
    private UserService userService;

    @PostMapping(value = "/login")
    public String login(@RequestBody User user){
        System.out.print(user.toString());
        userService.login(user);
        return "ok";
    }

//    private

}



