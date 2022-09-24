package com.wyhwy.diagnosis_backend.mapper;

import com.wyhwy.diagnosis_backend.domain.Image;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ImageMapper {
    Image findById(Integer id);

    List<Image> select(Integer start, Integer len);

    Integer count();

    void create(Image image);

    void update(Image image);

    void del(Integer id);

}
