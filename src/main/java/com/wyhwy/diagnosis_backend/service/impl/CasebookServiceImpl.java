package com.wyhwy.diagnosis_backend.service.impl;

import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.mapper.CasebookMapper;
import com.wyhwy.diagnosis_backend.po.CasebookPo;
import com.wyhwy.diagnosis_backend.service.CasebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CasebookServiceImpl implements CasebookService {
    @Autowired
    private CasebookMapper casebookMapper;

    public HttpResult<CasebookPo> findById(Integer id) {
        CasebookPo data = casebookMapper.findById(id);
        return new HttpResult<CasebookPo>(data);
    }
}
