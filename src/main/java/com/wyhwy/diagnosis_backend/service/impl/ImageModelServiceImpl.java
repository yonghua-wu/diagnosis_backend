package com.wyhwy.diagnosis_backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wyhwy.diagnosis_backend.domain.ImageModel;
import com.wyhwy.diagnosis_backend.mapper.ImageModelMapper;
import com.wyhwy.diagnosis_backend.service.ImageModelService;

@Service
public class ImageModelServiceImpl implements ImageModelService {
    @Autowired
    private ImageModelMapper imageModelMapper;

    @Override
    public Integer create(ImageModel imageModel) {
        imageModelMapper.create(imageModel);
        return imageModel.getId();
    }
}
