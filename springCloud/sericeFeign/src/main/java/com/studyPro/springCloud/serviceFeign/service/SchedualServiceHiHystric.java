package com.studyPro.springCloud.serviceFeign.service;

import org.springframework.stereotype.Component;

/**
 * @author 范富强
 * @description
 * @date 2018/2/26 18:22
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry," + name;
    }
}
