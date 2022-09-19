package com.wyhwy.diagnosis_backend.mapper;

import com.wyhwy.diagnosis_backend.domain.Casebook;
import com.wyhwy.diagnosis_backend.po.CasebookPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CasebookMapper {
    /**
     * 根据Id查
     * @param id id
     */
    CasebookPo findById(Integer id);

//    /**
//     * 分页查询
//     * @param current 当前页
//     * @param size 页大小
//     * @return 返回 list
//     */
//    List<Casebook> select(Integer current, Integer size);
//
//    /**
//     * 创建
//     * @param casebook 病例实体
//     */
//    void create(Casebook casebook);
//
//    /**
//     * 更新
//     * @param casebook 病例实体
//     */
//    void update(Casebook casebook);
//
//    /**
//     * 删除
//     * @param id id
//     */
//    void delete(Integer id);
}
