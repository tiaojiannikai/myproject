package com.tc.service.impl;

import com.tc.dao.UserMapper;
import com.tc.pojo.User;
import com.tc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public List<User> findAll() {
        List<User> list = (List<User>) redisTemplate.boundValueOps("user_key").get();
        if (!StringUtils.isEmpty(list)){
            return list;
        }
        List<User> users = userMapper.findAll();
        redisTemplate.boundValueOps("user_key").set(users);
        return users;
    }
}
