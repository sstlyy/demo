package com.example.demo.mapper;

import com.example.demo.po.User;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface userMapper {
    public List<User> findAll();

}
