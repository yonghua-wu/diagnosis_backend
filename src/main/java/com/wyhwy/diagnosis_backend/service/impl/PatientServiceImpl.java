package com.wyhwy.diagnosis_backend.service.impl;

import java.util.List;

import com.wyhwy.diagnosis_backend.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.Patient;
import com.wyhwy.diagnosis_backend.mapper.PatientMapper;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientMapper patientMapper;
    
    public Patient findById(Integer id) {
        return patientMapper.findById(id);
    }
    public ResultPage<Patient> page(Integer current, Integer size) {
        List<Patient> list = patientMapper.select((current - 1) * size, size);
        int count = patientMapper.count();
        ResultPage<Patient> page = new ResultPage<>(current, size, count, list);
        return page;
    }
    public void create(Patient patient) {
        patientMapper.create(patient);
    }
    public void update(Patient patient) {
        patientMapper.update(patient);
    }
    public void del(Integer id) {
        patientMapper.del(id);
    }
}
