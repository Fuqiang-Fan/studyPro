package com.studyPro.springboot.conf;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

/**
 * @author 范富强
 * @description
 * @date 2018/1/11 14:13
 * @description
 *
 *  ***********
 *  spring-boot 项目作为单独的项目可以找到webapp目录，但是如果做为一个moudel的时候就找不到该目录了，需要显式指定目录
 *  ***********
 */
@Configuration
public class TomcatConfig {
    @Bean
    public EmbeddedServletContainerFactory embeddedServletContainerFactory() {
        ConfigurableEmbeddedServletContainer factory = new TomcatEmbeddedServletContainerFactory();
        factory.setDocumentRoot(new File("D:\\idea\\projects\\studyPro\\springBoot\\src\\main\\webapp"));
        return (EmbeddedServletContainerFactory) factory;
    }
}
