package com.studyPro.springCloud.serviceRibbon.controller;

import com.studyPro.springCloud.serviceRibbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 范富强
 * @description
 * @date 2018/2/24 11:43
 */
@RestController
public class HelloControler {
    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
