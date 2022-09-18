package com.wyhwy.diagnosis_backend.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ImageModel {
    private Integer modelId;
    private Integer imageId;
}
