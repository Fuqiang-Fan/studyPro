package com.studyPro.springCloud.eurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 范富强
 * @description
 * @date 2018/2/9 16:58
 */
@SpringBootApplication
@EnableEurekaServer
@EnableAutoConfiguration
public class EurekaserverApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaserverApplication.class, args);
    }
}
