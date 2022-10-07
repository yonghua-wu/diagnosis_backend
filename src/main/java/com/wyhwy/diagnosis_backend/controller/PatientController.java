package com.wyhwy.diagnosis_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.Patient;
import com.wyhwy.diagnosis_backend.interceptors.utils.JWTUtils;
import com.wyhwy.diagnosis_backend.service.PatientService;

@RestController
@CrossOrigin
@RequestMapping("/api/patient")
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
    public HttpResult<Integer> create(@RequestBody Patient patient, @RequestHeader(value = "token",required = false) String token) {
        try {
            DecodedJWT verify = JWTUtils.getTokenInfo(token);
            Integer userId = Integer.parseInt(verify.getClaim("id").asString());
            patient.setUserId(userId);
            Integer id = patientService.create(patient);
            return new HttpResult<>(id);
        } catch (Exception e) {
            return new HttpResult<>(500, "创建病人失败" + e.toString());
        }
    }
    @PostMapping("update")
    public HttpResult<Integer> update(@RequestBody Patient patient, @RequestHeader(value = "token",required = false) String token) {
        try {
            DecodedJWT verify = JWTUtils.getTokenInfo(token);
            Integer userId = Integer.parseInt(verify.getClaim("id").asString());
            patient.setUserId(userId);
            System.out.println(patient);
            Integer id = patientService.update(patient);
            return new HttpResult<>(id);
        } catch (Exception e) {
            System.out.println(e);
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
// 更新病人失败org.springframework.jdbc.BadSqlGrammarException: \r
// ### Error updating database.  Cause: java.sql.SQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '79,
            
            
//                 patient_age = 16,
            
//    ' at line 5\r
// ### The error may exist in file [D:\\Users\\hua\\Documents\\project\\diagnosis_backend\\target\\classes\\mapper\\Patient.xml]\r
// ### The error may involve defaultParameterMap\r
// ### The error occurred while setting parameters\r
// ### SQL: update patient          SET patient_name = ?,                                           patient_gender ?,                                           patient_age = ?,                                           phone_number = ?,                                           past_history = ?,                                                                                                            user_id = ?          where id = ?\r
// ### Cause: java.sql.SQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '79,
            
            
//                 patient_age = 16,
            
//    ' at line 5
// ; bad SQL grammar []; nested exception is java.sql.SQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '79,
            
            
//                 patient_age = 16,
            
//    ' at line 5