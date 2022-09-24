package com.wyhwy.diagnosis_backend.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Image extends Base{
    private Integer casebookId;
    private Integer patientId;
    private String imageAddress;
    private Integer imageProperties;
    private Integer diagnosticStatus;
//    private ImageModel imageModel;
}
