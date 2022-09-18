package com.wyhwy.diagnosis_backend.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class User extends Base{
    private String username;
    private String password;
    private Integer gender;
    private Integer workExperience;
    private Integer title;
    private String realName;
}
