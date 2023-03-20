package com.tc.dao;

import com.tc.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
