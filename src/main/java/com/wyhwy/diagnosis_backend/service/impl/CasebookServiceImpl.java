package com.wyhwy.diagnosis_backend.service.impl;

import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.Casebook;
import com.wyhwy.diagnosis_backend.mapper.CasebookMapper;
import com.wyhwy.diagnosis_backend.service.CasebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CasebookServiceImpl implements CasebookService {
    @Autowired
    private CasebookMapper casebookMapper;

    public HttpResult<Casebook> findById(Integer id) {
        Casebook data = casebookMapper.findById(id);
        return new HttpResult<Casebook>(data);
    }
    public HttpResult<ResultPage<Casebook>> page(Integer current, Integer size) {
        List<Casebook> list = casebookMapper.select((current - 1) * size, size);
        int count = casebookMapper.count();
        ResultPage<Casebook> page = new ResultPage<>(current, size, count, list);
        return new HttpResult<>(page);
    }
    public void create(Casebook casebook) {
        casebookMapper.create(casebook);
    }
    public void update(Casebook casebook) {
        casebookMapper.update(casebook);
    }
    public void del(Integer id) {
        casebookMapper.del(id);
    }
}
