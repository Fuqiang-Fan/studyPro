package com.studyPro.springboot.controller;

import com.studyPro.springboot.exception.ServiceException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 范富强
 * @description
 * @date 2018/1/9 15:34
 */
@RestController
public class AdviceController {

    @RequestMapping("/hello1")
    public String hello1() {
        int i = 1 / 0;
        return "hello";
    }

    @RequestMapping("/hello2")
    public String hello2(Long id) {
        String string = null;
        string.length();
        return "hello";
    }

    @RequestMapping("/hello3")
    public List<String> hello3() {
        throw new ServiceException("test");
    }

    @RequestMapping("/hello4")
    public String hello4() {
        return "hello";
    }
}
