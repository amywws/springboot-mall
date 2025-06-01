package com.amy.springbootmall.service.impl;

import com.amy.springbootmall.dao.UserDao;
import com.amy.springbootmall.dto.UserRegisterRequest;
import com.amy.springbootmall.model.User;
import com.amy.springbootmall.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class UserServiceImpl implements UserService {

    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
       //檢查註冊的 email
        User user = userDao.getUserByEmail(userRegisterRequest.getEmail());

        if(user != null){
            logger.warn("該 email {} 已經被註冊", userRegisterRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        // 創建帳號
        return userDao.createUser(userRegisterRequest);
    }
}
