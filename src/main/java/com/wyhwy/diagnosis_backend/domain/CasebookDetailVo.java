package com.wyhwy.diagnosis_backend.domain;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CasebookDetailVo extends Casebook {
    private List<ImageVo> images;
    private Patient patient;
}
