package com.wyhwy.diagnosis_backend.controller;

import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.po.CasebookPo;
import com.wyhwy.diagnosis_backend.service.CasebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/casebook")
public class CasebookController {

    @Autowired
    private CasebookService casebookService;

    @GetMapping("/detail")
    private HttpResult<CasebookPo> detail(Integer id) {
        return casebookService.findById(id);
    }
    @GetMapping("/page")
    private HttpResult<ResultPage<CasebookPo>> page(@RequestParam Integer current, @RequestParam Integer size) {
        return casebookService.page(current, size);
    }
}
