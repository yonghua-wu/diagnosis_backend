package com.wyhwy.diagnosis_backend.service;

import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.Casebook;

public interface CasebookService {
    HttpResult<Casebook> findById(Integer id);
    HttpResult<ResultPage<Casebook>> page(Integer current, Integer size);
}
