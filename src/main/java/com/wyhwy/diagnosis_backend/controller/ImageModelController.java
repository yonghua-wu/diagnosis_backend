package com.wyhwy.diagnosis_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.domain.Image;
import com.wyhwy.diagnosis_backend.domain.ImageModel;
import com.wyhwy.diagnosis_backend.domain.ImageModelReqVo;
import com.wyhwy.diagnosis_backend.service.ImageModelService;
import com.wyhwy.diagnosis_backend.service.ImageService;
import com.wyhwy.diagnosis_backend.service.ModelService;

@CrossOrigin
@RestController
@RequestMapping("/api/imageModel")
public class ImageModelController {
    @Autowired
    private ImageService imageService;

    @Autowired
    private ImageModelService imageModelService;

    @PostMapping("/create")
    public HttpResult<Void> create(@RequestBody ImageModelReqVo imageModels){
        try {
            System.out.println(imageModels.getImage().toString());
            Integer imgId = imageService.create(imageModels.getImage());
            System.out.println(imageModels.getModelIds());
            for (Integer modelId : imageModels.getModelIds() ) {
                System.out.println(modelId);
                imageModelService.create(new ImageModel(modelId, imgId));
            }
            return new HttpResult<>();
        }catch (Exception e){
            return new HttpResult<>(500, "创建病例失败" + e.toString());
        }
    }
}
