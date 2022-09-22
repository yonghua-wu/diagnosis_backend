package com.wyhwy.diagnosis_backend.service.impl;

import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.mapper.CasebookMapper;
import com.wyhwy.diagnosis_backend.po.CasebookPo;
import com.wyhwy.diagnosis_backend.service.CasebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CasebookServiceImpl implements CasebookService {
    @Autowired
    private CasebookMapper casebookMapper;

    public HttpResult<CasebookPo> findById(Integer id) {
        CasebookPo data = casebookMapper.findById(id);
        return new HttpResult<CasebookPo>(data);
    }
    public HttpResult<ResultPage<CasebookPo>> page(Integer current, Integer size) {
        List<CasebookPo> list = casebookMapper.select((current - 1) * size, size);
        int count = casebookMapper.count();
        ResultPage<CasebookPo> page = new ResultPage<>(current, size, count, list);
        return new HttpResult<>(page);
    }
}
