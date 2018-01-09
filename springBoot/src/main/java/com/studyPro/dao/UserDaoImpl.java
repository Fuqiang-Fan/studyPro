package com.studyPro.dao;

import com.studyPro.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 范富强
 * @description
 * @date 2018/1/9 10:46
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(UserInfo userInfo) {
        jdbcTemplate.update("INSERT INTO USER_INFO(USER_NAME, MOBILE, CREATE_TIME, UPDATE_TIME) VALUE (?, ?, NOW(), NOW())", userInfo.getUserName(), userInfo.getMobile());
    }

    @Override
    public List<UserInfo> findAll() {
        String mobile = "13520819835";
        return jdbcTemplate.query("select ID, USER_NAME AS userName, MOBILE from USER_INFO WHERE MOBILE = ?", new Object[]{mobile}, BeanPropertyRowMapper.newInstance(UserInfo.class));
    }

    @Override
    public List<UserInfo> findByNameLike(String name) {
        return jdbcTemplate.query("select ID, USER_NAME AS userName, MOBILE from USER_INFO WHERE USER_NAME = ?", new Object[]{name}, BeanPropertyRowMapper.newInstance(UserInfo.class));
    }
}
