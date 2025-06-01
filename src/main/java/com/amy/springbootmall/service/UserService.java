package com.amy.springbootmall.service;

import com.amy.springbootmall.dto.UserLoginRequest;
import com.amy.springbootmall.dto.UserRegisterRequest;
import com.amy.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);

}
