package com.wyhwy.diagnosis_backend.mapper;

import com.wyhwy.diagnosis_backend.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
//    User selectById(int id);
//    void insert(User user);
//    User findByUsername(String username);
//    User findUserById(Integer Id);
    User login(User user);

}
