package com.wyhwy.diagnosis_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.Patient;
import com.wyhwy.diagnosis_backend.service.PatientService;

@RestController
@RequestMapping("patient")
public class PatientController {
    @Autowired
    private PatientService patientService;
    @GetMapping("detail")
    public HttpResult<Patient> detail(Integer id) {
        return new HttpResult<>(patientService.findById(id));
    }
    @GetMapping("page")
    public HttpResult<ResultPage<Patient>> page(Integer current, Integer size) {
        return new HttpResult<>(patientService.page(current, size));
    }
    @PostMapping("create")
    public HttpResult<Void> create(@RequestBody Patient patient) {
        try {
            // System.out.println(patient.toString());
            patientService.create(patient);
            return new HttpResult<>();
        } catch (Exception e) {
            return new HttpResult<>(500, "创建病人失败" + e.toString());
        }
    }
    @PostMapping("update")
    public HttpResult<Void> update(@RequestBody Patient patient) {
        try {
            patientService.update(patient);
            return new HttpResult<>();
        } catch (Exception e) {
            return new HttpResult<>(500, "更新病人失败" + e.toString());
        }
    }
    @DeleteMapping("del")
    public HttpResult<Void> del(Integer id) {
        try {
            patientService.del(id);
            return new HttpResult<>();
        } catch (Exception e) {
            return new HttpResult<>(500, "删除病人失败" + e.toString());
        }
    }
}
