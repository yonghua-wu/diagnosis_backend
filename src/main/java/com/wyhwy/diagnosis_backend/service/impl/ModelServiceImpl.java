package com.wyhwy.diagnosis_backend.service.impl;

import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.Model;
import com.wyhwy.diagnosis_backend.mapper.ModelMapper;
import com.wyhwy.diagnosis_backend.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelServiceImpl implements ModelService {

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public HttpResult<Model> findById(Integer id) {
        Model model = modelMapper.findById(id);
        return new HttpResult<Model>(model);
    }

    @Override
    public HttpResult<ResultPage<Model>> page(Integer current, Integer size) {
        List<Model> list = modelMapper.select((current - 1) * size, size);
        int count = modelMapper.count();
        ResultPage<Model> page = new ResultPage<>(current, size, count, list);
        return new HttpResult<>(page);
    }

    @Override
    public void create(Model model) {
        modelMapper.create(model);
    }

    @Override
    public void update(Model model) {
        modelMapper.update(model);
    }

    @Override
    public void del(Integer id) {
        modelMapper.del(id);
    }
}
