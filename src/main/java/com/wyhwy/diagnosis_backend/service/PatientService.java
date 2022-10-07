package com.wyhwy.diagnosis_backend.service;

import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.Patient;

public interface PatientService {
    Patient findById(Integer id);
    ResultPage<Patient> page(Integer current, Integer size);
    Integer create(Patient patient);
    Integer update(Patient patient);
    void del(Integer id);
}
