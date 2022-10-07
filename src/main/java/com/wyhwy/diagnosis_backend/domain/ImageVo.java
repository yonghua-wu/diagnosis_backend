package com.wyhwy.diagnosis_backend.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ImageVo extends Image {
    private String patientName;
    private List<ImageModel> imageModels;
    public static List<ImageVo> convert(List<Image> images) {
        // private Integer casebookId;
        // private Integer patientId;
        // private String imageAddress;
        // private Integer imageProperties;
        // private Integer diagnosticStatus;
        // private String resultImg;
        List<ImageVo> imageVos = new ArrayList<>();
        for (Image image : images) {
            ImageVo imageVo = new ImageVo();
            imageVo.setId(image.getId());
            imageVo.setCasebookId(image.getCasebookId());
            imageVo.setPatientId(image.getPatientId());
            imageVo.setImageAddress(image.getImageAddress());
            imageVo.setImageProperties(image.getImageProperties());
            imageVo.setDiagnosticStatus(image.getDiagnosticStatus());
            imageVo.setResultImg(image.getResultImg());
            imageVos.add(imageVo);
        }
        return imageVos;
    }
}
