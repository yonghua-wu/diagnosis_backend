package com.wyhwy.diagnosis_backend.domain;

import lombok.Data;

@Data
public class Casebook extends Base{
    private String patientDescription;
    private Integer diagnosticStatus;
    private String rvsIdentificationResult;
    private String maIdentificationResult;
    private String doctorAdvice;
    private User user;
    private Patient patient;
}
