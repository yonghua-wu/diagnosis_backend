package com.wyhwy.diagnosis_backend.service.impl;

import com.wyhwy.diagnosis_backend.HttpResult;
import com.wyhwy.diagnosis_backend.ResultPage;
import com.wyhwy.diagnosis_backend.domain.Image;
import com.wyhwy.diagnosis_backend.domain.ImageVo;
import com.wyhwy.diagnosis_backend.domain.Model;
import com.wyhwy.diagnosis_backend.mapper.ImageMapper;
import com.wyhwy.diagnosis_backend.mapper.ImageModelMapper;
import com.wyhwy.diagnosis_backend.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageMapper imageMapper;

    @Autowired
    private ImageModelMapper imageModelMapper;

    @Override
    public Image findById(Integer id) {
        Image img = imageMapper.findById(id);
        Integer imgId = img.getId();
        for (Model model : imageModelMapper.findModelsByImageId(imgId)) {
            System.out.println(model.getModelAddress());
        }
        return img;
    }

    @Override
    public List<ImageVo> findByCasebookId(Integer casebookId) {
        List<Image> images = imageMapper.findByCasebookId(casebookId);
        List<ImageVo> imageVos = ImageVo.convert(images);
        for(ImageVo imageVo : imageVos){
            Integer imgId = imageVo.getId();
            imageVo.setImageModels(imageModelMapper.findListByImageId(imgId));
        }
        return imageVos;
    }

    @Override
    public ResultPage<Image> page(Integer current, Integer size) {
        List<Image> list = imageMapper.select((current - 1) * size, size);
        int count = imageMapper.count();
        ResultPage<Image> page = new ResultPage<>(current, size, count, list);
        return page;
    }

    @Override
    public Integer create(Image image) {
        imageMapper.create(image);
        return image.getId();
    }

    @Override
    public Integer update(Image image) {
        imageMapper.update(image);
        return image.getId();
    }

    @Override
    public void del(Integer id) {
        imageMapper.del(id);
    }
}
