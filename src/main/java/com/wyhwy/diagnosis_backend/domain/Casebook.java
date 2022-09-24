package com.wyhwy.diagnosis_backend.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Casebook extends Base{
    private String patientDescription;
    private Integer diagnosticStatus;
    private String rvsIdentificationResult;
    private String maIdentificationResult;
    private String doctorAdvice;
    private Integer userId;
    private Integer patientId;
}
