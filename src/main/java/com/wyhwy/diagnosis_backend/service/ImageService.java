package com.wyhwy.diagnosis_backend.service;

import java.util.List;

import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.Image;
import com.wyhwy.diagnosis_backend.domain.ImageVo;

public interface ImageService {

    Image findById(Integer id);

    List<ImageVo> findByCasebookId(Integer casebookIds);

    ResultPage<Image> page(Integer current, Integer size);

    Integer create(Image image);

    Integer update(Image image);

    void del(Integer id);

}
