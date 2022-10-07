package com.wyhwy.diagnosis_backend.domain;

import lombok.Data;

@Data
public class ImageModelReqVo {
    private Image image;
    private Integer[] modelIds;
}
