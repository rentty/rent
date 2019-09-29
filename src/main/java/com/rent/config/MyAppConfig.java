package com.jl.springboot.config;

import com.jl.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {
    @Bean
    public HelloService helloService2() {
        System.out.println("配置类@Bean");
        return new HelloService();
    }
}
