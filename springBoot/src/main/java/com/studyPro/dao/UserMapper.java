package com.studyPro.dao;

import com.studyPro.model.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * @author 范富强
 * @description
 * @date 2018/1/8 14:48
 */
public interface UserMapper {

    void insert(User user);

    List<User> findAll();

    List<User> findByNameLike(String name);


}
