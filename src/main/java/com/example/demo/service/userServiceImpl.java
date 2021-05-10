package com.example.demo.service;

import com.example.demo.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.example.demo.mapper.userMapper;

@Service
public class userServiceImpl implements userService{

    @Autowired
    private userMapper userMapper;
    @Override
    public List<User> findAll(){
        return userMapper.findAll();
    }
}
