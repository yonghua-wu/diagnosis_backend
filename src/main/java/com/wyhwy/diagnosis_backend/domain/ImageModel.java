package com.wyhwy.diagnosis_backend.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ImageModel extends Base {
    private Integer id;
    private Integer modelId;
    private Integer imageId;
    private String resultAddress;
    public ImageModel(Integer modelId, Integer imageId) {
        this.modelId = modelId;
        this.imageId = imageId;
    }
}
