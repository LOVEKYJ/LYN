package com.lyn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lyn.mapper")
public class LyndemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LyndemoApplication.class, args);
    }
}
