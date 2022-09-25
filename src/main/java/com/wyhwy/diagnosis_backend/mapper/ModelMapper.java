package com.wyhwy.diagnosis_backend.mapper;


import com.wyhwy.diagnosis_backend.domain.Model;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ModelMapper {

    Model findById(Integer id);

    List<Model> select(Integer start, Integer len);

    Integer count();

    void create(Model model);

    void update(Model model);

    void del(Integer id);

}
