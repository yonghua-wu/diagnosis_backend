package com.wyhwy.diagnosis_backend.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Base {
    private Integer id;
    private Date createdTime;
    private Date updatedTime;
    private Integer createdBy;
    private Integer updatedBy;
    private String remark;
}
