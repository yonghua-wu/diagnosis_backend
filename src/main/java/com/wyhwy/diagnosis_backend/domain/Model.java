package com.wyhwy.diagnosis_backend.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Model extends Base {
    private String modelAddress;
    private ImageModel imageModel;
}
