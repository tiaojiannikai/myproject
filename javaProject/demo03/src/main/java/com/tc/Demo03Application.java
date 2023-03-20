package com.tc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo03Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Demo03Application.class, args);
    }
}
