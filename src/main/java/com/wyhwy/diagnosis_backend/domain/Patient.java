package com.wyhwy.diagnosis_backend.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Patient extends Base{
    private Integer id;
    private String patientName;
    private Integer patientGender;
    private Integer patientAge;
    private String phoneNumber;
    private String pastHistory;
    private Integer userId;
}
