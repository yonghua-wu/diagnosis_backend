package com.wyhwy.diagnosis_backend.domain;

import lombok.Data;

@Data
public class Patient extends Base{
    private String patientName;
    private Integer patientGender;
    private Integer patientAge;
    private String phoneNumber;
    private String pastHistory;
    private User user;
}
