package com.rent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//123
//@ImportResource(locations={"classpath:bean.xml"})
@SpringBootApplication
public class rentApplication {

    public static void main(String[] args) {
        SpringApplication.run(rentApplication.class, args);
    }

}
