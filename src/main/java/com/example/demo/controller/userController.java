package com.example.demo.controller;

import com.example.demo.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.userServiceImpl;

import java.util.List;
import java.util.Map;

@RestController
public class userController {
    @Autowired
    private userServiceImpl userServiceImpl;
    @RequestMapping("/getUser")
    @ResponseBody
    public  List<User> findAll(){
        List<User> list = userServiceImpl.findAll();
      return list;
}
}
