package com.wyhwy.diagnosis_backend.controller;

import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.Casebook;
import com.wyhwy.diagnosis_backend.service.CasebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/casebook")
public class CasebookController {

    @Autowired
    private CasebookService casebookService;

    @GetMapping("/detail")
    private HttpResult<Casebook> detail(Integer id) {
        return casebookService.findById(id);
    }
    @GetMapping("/page")
    private HttpResult<ResultPage<Casebook>> page(@RequestParam Integer current, @RequestParam Integer size) {
        return casebookService.page(current, size);
    }
    @PostMapping("/create")
    private HttpResult<NullPointerException> create(@RequestBody Casebook casebook) {
        try {
            casebookService.create(casebook);
            return new HttpResult<>();
        } catch (Exception e) {
            return new HttpResult<>(500, "创建病例失败" + e.toString());
        }
    }
    @PostMapping("/update")
    private HttpResult<NullPointerException> update(@RequestBody Casebook casebook) {
        try {
            casebookService.update(casebook);
            return new HttpResult<>();
        } catch (Exception e) {
            return new HttpResult<>(500, "更新病例失败" + e.toString());
        }
    }
}
