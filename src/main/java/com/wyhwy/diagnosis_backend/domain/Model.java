package com.wyhwy.diagnosis_backend.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class Model extends Base {
    private String modelAddress;
    // private ImageModel imageModel;
//    private List<Image> AllImage;
}
