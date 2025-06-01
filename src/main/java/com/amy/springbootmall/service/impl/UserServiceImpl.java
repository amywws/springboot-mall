package com.amy.springbootmall.service.impl;

import com.amy.springbootmall.dao.UserDao;
import com.amy.springbootmall.dto.UserRegisterRequest;
import com.amy.springbootmall.model.User;
import com.amy.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
