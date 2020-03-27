package com.wuqiong.springcloud.user.service.impl;

import com.wuqiong.springcloud.user.pojo.User;
import com.wuqiong.springcloud.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(1);
        user.setUsername("肖战");
        user.setPassword("123456");
        return user;
    }
}
