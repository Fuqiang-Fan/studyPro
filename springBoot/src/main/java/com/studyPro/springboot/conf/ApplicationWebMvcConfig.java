package com.studyPro.springboot.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author 范富强
 * @description
 * @date 2018/1/11 11:34
 *
 *  *********************
 *  用来制定mvc的前缀和后缀，可在这配置，也可使用配置文件配置
 *  *********************
 */
//@Configuration
public class ApplicationWebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/page/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
