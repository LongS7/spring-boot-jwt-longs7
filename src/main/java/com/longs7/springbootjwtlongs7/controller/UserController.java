package com.longs7.springbootjwtlongs7.controller;

import com.longs7.springbootjwtlongs7.entity.User;
import com.longs7.springbootjwtlongs7.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public void registerUser(@RequestBody User user) {

    }
}
