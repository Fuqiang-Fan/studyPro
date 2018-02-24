package com.studyPro.springCloud.serviceFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author 范富强
 * @description
 * @date 2018/2/24 14:20
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class ServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class, args);
    }
}
