package com.wyhwy.diagnosis_backend.mapper;

import java.util.List;

import com.wyhwy.diagnosis_backend.domain.Patient;

public interface PatientMapper {
    /**
     * 根据Id查
     * @param id id
     */
    Patient findById(Integer id);

    /**
     * 分页查询
     * @param start 开始位置
     * @param len 页大小
     * @return 返回 list
     */
    List<Patient> select(Integer start, Integer len);

    /**
     * 统计条数
     * @return
     */
    Integer count();

    void create(Patient patient);
    void update(Patient patient);
    void del(Integer id);
}
