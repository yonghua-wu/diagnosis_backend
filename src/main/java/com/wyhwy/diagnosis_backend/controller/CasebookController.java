package com.wyhwy.diagnosis_backend.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.Casebook;
import com.wyhwy.diagnosis_backend.domain.CasebookDetailVo;
import com.wyhwy.diagnosis_backend.domain.CasebookVo;
import com.wyhwy.diagnosis_backend.domain.Image;
import com.wyhwy.diagnosis_backend.domain.ImageVo;
import com.wyhwy.diagnosis_backend.domain.Patient;
import com.wyhwy.diagnosis_backend.domain.User;
import com.wyhwy.diagnosis_backend.interceptors.utils.JWTUtils;
import com.wyhwy.diagnosis_backend.service.CasebookService;
import com.wyhwy.diagnosis_backend.service.ImageService;
import com.wyhwy.diagnosis_backend.service.PatientService;
import com.wyhwy.diagnosis_backend.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/casebook")
public class CasebookController {

    @Autowired
    private CasebookService casebookService;

    @Autowired
    private PatientService patientService;

    @Autowired
    private UserService userService;

    @Autowired
    private ImageService imageService;

    @GetMapping("/detail")
    private HttpResult<CasebookDetailVo> detail(Integer id) {
        Casebook casebook = casebookService.findById(id);
        CasebookDetailVo casebookDetailVo = new CasebookDetailVo();
        casebookDetailVo.setId(casebook.getId());
        casebookDetailVo.setPatientId(casebook.getPatientId());
        casebookDetailVo.setUserId(casebook.getUserId());
        casebookDetailVo.setPatientDescription(casebook.getPatientDescription());
        casebookDetailVo.setDiagnosticStatus(casebook.getDiagnosticStatus());
        casebookDetailVo.setRvsIdentificationResult(casebook.getRvsIdentificationResult());
        casebookDetailVo.setMaIdentificationResult(casebook.getMaIdentificationResult());
        casebookDetailVo.setDoctorAdvice(casebook.getDoctorAdvice());

        Patient patient = patientService.findById(casebook.getPatientId());
        casebookDetailVo.setPatient(patient);
        List<ImageVo> images = imageService.findByCasebookId(casebook.getId());
        casebookDetailVo.setImages(images);
        return new HttpResult<>(casebookDetailVo);
    }
    @GetMapping("/page")
    private HttpResult<ResultPage<CasebookVo>> page(@RequestParam Integer current, @RequestParam Integer size) {
        System.out.println("current:" + current + ",size:" + size);
        ResultPage<Casebook> casebookListPage = casebookService.page(current, size);
        List<Casebook> casebookList = casebookListPage.getList();
        List<CasebookVo> casebookListVo = new ArrayList<>();
        for (Casebook casebook : casebookList) {
            CasebookVo casebookVo = new CasebookVo();
            casebookVo.setId(casebook.getId());
            casebookVo.setPatientId(casebook.getPatientId());
            casebookVo.setUserId(casebook.getUserId());
            casebookVo.setPatientDescription(casebook.getPatientDescription());
            casebookVo.setDiagnosticStatus(casebook.getDiagnosticStatus());
            casebookVo.setRvsIdentificationResult(casebook.getRvsIdentificationResult());
            casebookVo.setMaIdentificationResult(casebook.getMaIdentificationResult());
            casebookVo.setDoctorAdvice(casebook.getDoctorAdvice());
    
            Patient patient = patientService.findById(casebook.getPatientId());
            casebookVo.setPatientName(patient.getPatientName());
            User userInfo = userService.findById(casebook.getUserId());
            casebookVo.setUserName(userInfo.getRealName());
            System.out.println(casebookVo);
            casebookListVo.add(casebookVo);
        }
        return new HttpResult<>(new ResultPage<>(current, size, casebookListPage.getTotal(), casebookListVo));
    }
    @PostMapping("/create")
    private HttpResult<Integer> create(@RequestBody Casebook casebook, @RequestHeader(value = "token",required = false) String token) {
        try {
            DecodedJWT verify = JWTUtils.getTokenInfo(token);
            Integer userId = Integer.parseInt(verify.getClaim("id").asString());
            casebook.setUserId(userId);
            Integer id = casebookService.create(casebook);
            return new HttpResult<>(id);
        } catch (Exception e) {
            return new HttpResult<>(500, "创建病例失败" + e.toString());
        }
    }
    @PostMapping("/update")
    private HttpResult<Integer> update(@RequestBody Casebook casebook) {
        try {
            Integer id = casebookService.update(casebook);
            return new HttpResult<>(id);
        } catch (Exception e) {
            return new HttpResult<>(500, "更新病例失败" + e.toString());
        }
    }
    @DeleteMapping("/del")
    private HttpResult<Void> del(@RequestParam Integer id) {
        try {
            casebookService.del(id);
            return new HttpResult<>();
        } catch (Exception e) {
            return new HttpResult<>(500, "删除病例失败" + e.toString());
        }
    }
}
