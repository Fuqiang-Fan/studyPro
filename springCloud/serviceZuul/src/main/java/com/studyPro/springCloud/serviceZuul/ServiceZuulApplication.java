package com.studyPro.springCloud.serviceZuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author 范富强
 * @description
 * @date 2018/2/27 11:09
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ServiceZuulApplication {

    public static void main(String args[]) {
        SpringApplication.run(ServiceZuulApplication.class, args);
    }
}
