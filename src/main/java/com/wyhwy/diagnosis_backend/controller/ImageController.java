package com.wyhwy.diagnosis_backend.controller;

import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.Image;
import com.wyhwy.diagnosis_backend.domain.ImageVo;
import com.wyhwy.diagnosis_backend.domain.Patient;
import com.wyhwy.diagnosis_backend.service.ImageService;
import com.wyhwy.diagnosis_backend.service.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/api/image")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @Autowired
    private PatientService patientService;

    @GetMapping("/detail")
    public HttpResult<ImageVo> detail(Integer id) {
        Image img = imageService.findById(id);
        ImageVo vo = new ImageVo();
        vo.setId(img.getId());
        vo.setCasebookId(img.getCasebookId());
        vo.setPatientId(img.getPatientId());
        vo.setImageAddress(img.getImageAddress());
        vo.setImageProperties(img.getImageProperties());
        vo.setDiagnosticStatus(img.getDiagnosticStatus());
        vo.setResultImg(img.getResultImg());
        Patient patient = patientService.findById(img.getPatientId());
        vo.setPatientName(patient.getPatientName());
        return new HttpResult<>(vo);
    }

    @GetMapping("/page")
    public HttpResult<ResultPage<ImageVo>> page(@RequestParam Integer current, @RequestParam Integer size){
        ResultPage<Image> imageListPage = imageService.page(current, size);
        List<Image> imageList = imageListPage.getList();
        List<ImageVo> imageListVo = new ArrayList<>();
        for (Image image : imageList) {
            ImageVo imageVo = new ImageVo();
            imageVo.setId(image.getId());
            imageVo.setCasebookId(image.getCasebookId());
            imageVo.setPatientId(image.getPatientId());
            imageVo.setImageAddress(image.getImageAddress());
            imageVo.setImageProperties(image.getImageProperties());
            imageVo.setDiagnosticStatus(image.getDiagnosticStatus());
            imageVo.setResultImg(image.getResultImg());
            Patient patient = patientService.findById(image.getPatientId());
            imageVo.setPatientName(patient.getPatientName());
            imageListVo.add(imageVo);
        }
        return new HttpResult<>(new ResultPage<>(current, size, imageListPage.getTotal(), imageListVo));
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
        System.out.println("file" + file);
        // 设置上传至项目文件夹下的uploadFile文件夹中，没有文件夹则创建
        File dir = new File("uploadFile");
        if(!dir.exists()){
            dir.mkdirs();
        }
        String name = (new Date().getTime()) + "_" + file.getOriginalFilename();
        String pathName = dir.getAbsolutePath() + File.separator + name + ".png";
        file.transferTo((new File(pathName))); // 存文件
        // 根据id 查询 imgae
        Image img = imageService.findById(img_id);
        // 更新image中的result_img
        img.setResultImg(pathName);
        imageService.update(img);
        
        return "上传完成！";
    }

}
