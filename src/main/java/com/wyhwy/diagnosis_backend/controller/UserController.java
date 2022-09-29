package com.wyhwy.diagnosis_backend.controller;

import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.User;
import com.wyhwy.diagnosis_backend.service.UserService;
import com.wyhwy.diagnosis_backend.interceptors.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//@RestController  @RestController是@ResponseBody和@Controller的组合注解

@RestController
@CrossOrigin
@RequestMapping("user")
public class  UserController{

    @Autowired
    private UserService userService;

//    @GetMapping("/user/login")
//    public String login(@RequestBody User user){
//
//        System.out.print(user.toString());
//        userService.login(user);
//        return "ok";
//    }

    @PostMapping("/login")
    public HttpResult<String> login(@RequestBody User user){

        System.out.print("用户名："+user.getUsername());
        System.out.print("密码："+user.getPassword());

//        Map<String,Object> map = new HashMap<>();

        try {
            User userDB = userService.login(user);
            Map<String, String> payload = new HashMap<>();  // payload
            payload.put("id",Integer.toString(userDB.getId()));
            payload.put("name",userDB.getUsername());
            // 生成jwt令牌
            String token = JWTUtils.getToken(payload);
            HttpResult<String> httpRest = new HttpResult<String>(token);
            return httpRest;
        } catch (Exception e) {
//            map.put("state",false);
//            map.put("msg",e.getMessage());
            e.printStackTrace();
            HttpResult<String> httpRest = new HttpResult<String>();
            httpRest.setCode(403);
            httpRest.setMsg("登录失败，账号或密码错误");
            return httpRest;
        }
    }

    @GetMapping("detail")
    public HttpResult<User> detail(@RequestParam Integer id) {
        return new HttpResult<>(userService.findById(id));
    }
    @GetMapping("page")
    public HttpResult<ResultPage<User>> page(@RequestParam Integer current,@RequestParam Integer size) {
        return new HttpResult<>(userService.page(current, size));
    }
    @PostMapping("create")
    public HttpResult<Void> create(@RequestBody User User) {
        try {
            // System.out.println(User.toString());
            userService.create(User);
            return new HttpResult<>();
        } catch (Exception e) {
            return new HttpResult<>(500, "创建医生失败" + e.toString());
        }
    }
    @PostMapping("update")
    public HttpResult<Void> update(@RequestBody User User) {
        try {
            userService.update(User);
            return new HttpResult<>();
        } catch (Exception e) {
            return new HttpResult<>(500, "更新医生失败" + e.toString());
        }
    }
    @DeleteMapping("del")
    public HttpResult<Void> del(@RequestParam Integer id) {
        try {
            userService.del(id);
            return new HttpResult<>();
        } catch (Exception e) {
            return new HttpResult<>(500, "删除医生失败" + e.toString());
        }
    }

}



