package com.example.whybackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.whybackend.dao")
public class WhyBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(WhyBackendApplication.class, args);
    }

}
