package com.studyPro.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 范富强
 * @description
 * @date 2018/2/27 14:28
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaServer
public class ConfigServerApplication {

    public static void main(String args[]) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
