package com.wyhwy.diagnosis_backend.service;

import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.Image;

public interface ImageService {

    HttpResult<Image> findById(Integer id);

    HttpResult<ResultPage<Image>> page(Integer current, Integer size);

    void create(Image image);

    void update(Image image);

    void del(Integer id);

}
