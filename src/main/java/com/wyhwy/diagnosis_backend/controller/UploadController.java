package com.wyhwy.diagnosis_backend.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.wyhwy.diagnosis_backend.HttpResult;

@RestController()
public class UploadController {
    @PostMapping("/api/upload")
    public HttpResult<String> upload(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
        File dir = new File("uploadFile");
        if(!dir.exists()){
            dir.mkdirs();
        }
        String name = (new Date().getTime()) + "_" + file.getOriginalFilename();
        String pathName = dir.getAbsolutePath() + File.separator + name;
        file.transferTo((new File(pathName))); // 存文件
        return new HttpResult<String>("/static/" + name);
    }
}
