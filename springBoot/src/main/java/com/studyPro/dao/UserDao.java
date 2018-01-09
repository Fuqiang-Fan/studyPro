package com.studyPro.dao;

import com.studyPro.model.UserInfo;

import java.util.List;

/**
 * @author 范富强
 * @description
 * @date 2018/1/8 14:48
 */
public interface UserDao {

    void insert(UserInfo userInfo);

    List<UserInfo> findAll();

    List<UserInfo> findByNameLike(String name);


}
