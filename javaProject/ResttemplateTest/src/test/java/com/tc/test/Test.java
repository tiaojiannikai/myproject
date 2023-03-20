package com.tc.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
@RunWith(SpringRunner.class)
public class Test {

    @Autowired
    private RestTemplate restTemplate;

    @org.junit.Test
    public void test(){
        String url = "http://localhost:8080/user/findAll";
        String object = restTemplate.getForObject(url, String.class);
        System.out.println(object);
    }
}
