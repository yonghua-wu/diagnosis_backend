package com.wyhwy.diagnosis_backend.service;

import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.Casebook;
import com.wyhwy.diagnosis_backend.po.CasebookPo;

public interface CasebookService {
    HttpResult<CasebookPo> findById(Integer id);
    HttpResult<ResultPage<CasebookPo>> page(Integer current, Integer size);
}
