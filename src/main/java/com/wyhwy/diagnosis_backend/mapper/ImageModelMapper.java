package com.wyhwy.diagnosis_backend.mapper;

import com.wyhwy.diagnosis_backend.domain.Image;
import com.wyhwy.diagnosis_backend.domain.ImageModel;
import com.wyhwy.diagnosis_backend.domain.Model;

import java.util.List;

public interface ImageModelMapper {
    List<Image> findImagesByModelId(Integer id);
    List<Model> findModelsByImageId(Integer id);
    List<ImageModel> findListByImageId(Integer id);
    void create(ImageModel imageModel);
}
