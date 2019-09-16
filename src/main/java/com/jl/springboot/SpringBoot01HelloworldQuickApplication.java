package com.jl.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
//123
//@ImportResource(locations={"classpath:bean.xml"})
@SpringBootApplication
public class SpringBoot01HelloworldQuickApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot01HelloworldQuickApplication.class, args);
    }

}
