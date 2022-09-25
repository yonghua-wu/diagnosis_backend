package com.wyhwy.diagnosis_backend.controller;

import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.Image;
import com.wyhwy.diagnosis_backend.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/image")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @GetMapping("/detail")
    public HttpResult<Image> detail(Integer id) { return imageService.findById(id); }

    @GetMapping("/page")
    public HttpResult<ResultPage<Image>> page(@RequestParam Integer current, @RequestParam Integer size){
        return imageService.page(current, size);
    }

    @PostMapping("/create")
    public HttpResult<Void> create(@RequestBody Image image){
        try {
            imageService.create(image);
            return new HttpResult<>();
        }catch (Exception e){
            return new HttpResult<>(500, "创建图像失败" + e.toString());
        }
    }

    @PostMapping("/update")
    public HttpResult<Void> update(@RequestBody Image image){
        try{
            imageService.update(image);
            return new HttpResult<>();
        }catch(Exception e){
            return new HttpResult<>(500, "更新病例失败" + e.toString());
        }
    }

    @DeleteMapping("/del")
    public HttpResult<Void> del(@RequestParam Integer id){
        try {
            imageService.del(id);
            return new HttpResult<>();
        }catch (Exception e){
            return new HttpResult<>(500, "删除病例失败" + e.toString());
        }
    }

}
