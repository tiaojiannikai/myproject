package com.tc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo02Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Demo02Application.class, args);
        Object user = run.getBean("user");
        System.out.println(user);
    }
}
