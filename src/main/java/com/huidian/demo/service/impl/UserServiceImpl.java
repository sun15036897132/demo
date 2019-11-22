package com.huidian.demo.service.impl;

import com.huidian.demo.domain.User;
import com.huidian.demo.mapper.UserMapper;
import com.huidian.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> getAllUser() {
        return userMapper.selectAllUser();
    }
}
