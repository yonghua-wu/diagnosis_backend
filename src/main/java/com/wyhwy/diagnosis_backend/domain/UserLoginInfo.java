package com.wyhwy.diagnosis_backend.domain;

import java.util.HashMap;

import lombok.Data;

@Data
public class UserLoginInfo{
    private Integer id;
    private String username;
    private Integer gender;
    private Integer workExperience;
    private Integer title;
    private String realName;
    public HashMap<String, String> toMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("id", id.toString());
        map.put("username", username);
        map.put("realName", realName);
        map.put("gender", gender.toString());
        map.put("workExperience", workExperience.toString());
        map.put("title", title.toString());
        return map;
    }
}

