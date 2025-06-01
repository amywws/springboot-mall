package com.amy.springbootmall.dao;

import com.amy.springbootmall.dto.UserRegisterRequest;
import com.amy.springbootmall.model.User;

public interface UserDao {
    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
