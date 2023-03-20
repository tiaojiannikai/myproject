package com.tc.condition;

import com.tc.annotation.ConditionalOnClass;
import com.tc.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    //@Conditional(value = OnClassCondition.class)
    @ConditionalOnClass(name = "redis.clients.jedis.Jedis")
    public User user(){
        return new User();
    }
}
