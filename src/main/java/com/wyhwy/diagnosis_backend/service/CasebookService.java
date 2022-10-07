package com.wyhwy.diagnosis_backend.service;

import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.Casebook;

public interface CasebookService {
    Casebook findById(Integer id);
    ResultPage<Casebook> page(Integer current, Integer size);
    Integer create(Casebook casebook);
    Integer update(Casebook casebook);
    void del(Integer id);
}
