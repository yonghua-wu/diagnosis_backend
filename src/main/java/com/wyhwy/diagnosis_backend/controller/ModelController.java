package com.wyhwy.diagnosis_backend.controller;

import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.Model;
import com.wyhwy.diagnosis_backend.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/model")
public class ModelController {

    @Autowired
    private ModelService modelService;

    @GetMapping("/detail")
    public HttpResult<Model> detail(Integer id){
        return modelService.findById(id);
    }

    @GetMapping("/page")
    public HttpResult<ResultPage<Model>> page(@RequestParam Integer current, @RequestParam Integer size){
        return modelService.page(current, size);
    }

    @PostMapping("/create")
    public HttpResult<Void> create(@RequestBody Model model) {
        try {
            modelService.create(model);
            return new HttpResult<>();
        } catch (Exception e) {
            return new HttpResult<>(500, "创建模型失败" + e.toString());
        }
    }

    @PostMapping("/update")
    public HttpResult<Void> update(@RequestBody Model model){
        try {
            modelService.update(model);
            return new HttpResult<>();
        }catch (Exception e){
            return new HttpResult<>(500, "跟新模型失败" + e.toString());
        }
    }

    @DeleteMapping("/del")
    public HttpResult<Void> del(@RequestParam Integer id){
        try {
            modelService.del(id);
            return new HttpResult<>();
        }catch (Exception e){
            return new HttpResult<>(500, "删除模型失败" + e.toString());
        }
    }

}
