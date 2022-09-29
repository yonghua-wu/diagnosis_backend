package com.wyhwy.diagnosis_backend.mapper;

import com.wyhwy.diagnosis_backend.domain.User;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
//    User selectById(int id);
//    void insert(User user);
//    User findByUsername(String username);
//    User findUserById(Integer Id);
    User login(User user);
        /**
     * 根据Id查
     * @param id id
     */
    User findById(Integer id);

    /**
     * 分页查询
     * @param start 开始位置
     * @param len 页大小
     * @return 返回 list
     */
    List<User> select(Integer start, Integer len);

    /**
     * 统计条数
     * @return
     */
    Integer count();

    void create(User user);
    void update(User user);
    void del(Integer id);
}
