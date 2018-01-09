package com.studyPro.dao;

import com.studyPro.model.UserInfo;
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
public class UserDaoTest {
    @Autowired
    UserDao userDao;

    @Test
    public void insert() throws Exception {
        try {
            UserInfo userInfo = new UserInfo("fanfuqiang","13520819835");
            userDao.insert(userInfo);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findAll() throws Exception {
        try {
            List<UserInfo> userInfoList = userDao.findAll();
            for (UserInfo userInfoTemp : userInfoList){
                System.out.println(userInfoTemp.getId() + "， " + userInfoTemp.getUserName() + "， " + userInfoTemp.getMobile());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findByNameLike() throws Exception {
        try {
            List<UserInfo> userInfoList = userDao.findByNameLike("fanfuqiang");
            for (UserInfo userInfoTemp : userInfoList){
                System.out.println(userInfoTemp.getId() + "， " + userInfoTemp.getUserName() + "， " + userInfoTemp.getMobile());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
