package com.tc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tc.dao")
public class ProvideApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProvideApplication.class,args);
    }
}
