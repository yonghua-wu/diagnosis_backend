package com.wyhwy.diagnosis_backend.controller;

import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.Image;
import com.wyhwy.diagnosis_backend.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;


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

    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file, @RequestParam("img_id") Integer img_id) throws Exception {
        System.out.println("嗯嗯");
//        System.out.println(img_id);
        System.out.println("file" + file);
//        System.out.println("name" + name);
        // 设置上传至项目文件夹下的uploadFile文件夹中，没有文件夹则创建
        File dir = new File("uploadFile");
        if(!dir.exists()){
            dir.mkdirs();
        }
        String name = "image";
        String pathName = dir.getAbsolutePath() + File.separator + name + ".png";
        file.transferTo((new File(pathName))); // 存文件

        // 根据id 查询 imgae
        HttpResult<Image> img = imageService.findById(img_id);
        // 更新image中的result_img

        img.getData().setResultImg(pathName);
        imageService.update(img.getData());

//        imageService.update(img.getData());

        return "上传完成！";
    }

}
