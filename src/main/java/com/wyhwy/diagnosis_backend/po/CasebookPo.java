package com.wyhwy.diagnosis_backend.po;

import com.wyhwy.diagnosis_backend.domain.Base;
import com.wyhwy.diagnosis_backend.domain.Patient;
import com.wyhwy.diagnosis_backend.domain.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CasebookPo extends Base {
    private String patientDescription;
    private Integer diagnosticStatus;
    private String rvsIdentificationResult;
    private String maIdentificationResult;
    private String doctorAdvice;
    private User user;
    private Patient patient;
}
