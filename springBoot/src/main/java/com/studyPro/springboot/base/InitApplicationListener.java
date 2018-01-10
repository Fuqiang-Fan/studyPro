package com.studyPro.springboot.base;

import com.studyPro.springboot.dao.UserDao;
import com.studyPro.springboot.model.UserInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 范富强
 * @description 初始化监听器，在服务器启动的时候执行
 * @date 2018/1/10 9:10
 * @version 1.0.0
 */
@Component
public class InitApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        ApplicationContext context = contextRefreshedEvent.getApplicationContext();
        String applicationName = context.getApplicationName();
        System.out.println("监听器启动");
    }
}
