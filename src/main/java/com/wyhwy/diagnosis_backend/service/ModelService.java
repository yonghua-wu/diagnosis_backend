package com.wyhwy.diagnosis_backend.service;


import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.Model;

public interface ModelService {
    HttpResult<Model> findById(Integer id);

    HttpResult<ResultPage<Model>> page(Integer current, Integer size);

    void create(Model model);

    void update(Model model);

    void del(Integer id);

}
