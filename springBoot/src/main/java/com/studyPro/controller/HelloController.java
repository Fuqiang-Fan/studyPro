package com.studyPro.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fanfuqiang on 2017/11/29.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    String home() {
        return "Hello World";
    }

    @RequestMapping("/hello/{myName}")
    String index(@PathVariable String myName) {
        return "Hellopp "+myName+"!!!";
    }

    @RequestMapping("/hello/List")
    List List() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        return list;
    }

    @RequestMapping("/hello/array")
    String[] array() {
        return new String[]{"1","2"};
    }
}
