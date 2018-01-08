package com.studyPro.dao;

import com.studyPro.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 范富强
 * @description
 * @date 2018/1/8 15:33
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    UserMapper userMapper;

    @Test
    public void insert() throws Exception {
        try {
            User user = new User("fanfuqiang","13520819835");
            userMapper.insert(user);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findAll() throws Exception {
        try {
            List<User> userList = userMapper.findAll();
            for (User userTemp: userList){
                System.out.println(userTemp.getId() + "， " + userTemp.getUserName() + "， " + userTemp.getMobile());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findByNameLike() throws Exception {
        try {
            List<User> userList = userMapper.findByNameLike("fanfuqiang");
            for (User userTemp: userList){
                System.out.println(userTemp.getId() + "， " + userTemp.getUserName() + "， " + userTemp.getMobile());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
