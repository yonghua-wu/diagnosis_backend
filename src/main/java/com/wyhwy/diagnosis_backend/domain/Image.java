package com.wyhwy.diagnosis_backend.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class Image extends Base{
    private Integer casebookId;
    private Integer patientId;
    private String imageAddress;
    private Integer imageProperties;
    private Integer diagnosticStatus;
    private String resultImg;
//    private ImageModel imageModel;
//    private List<Model> AllModel;
}
