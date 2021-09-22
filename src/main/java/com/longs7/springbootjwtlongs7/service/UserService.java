package com.longs7.springbootjwtlongs7.service;

import com.longs7.springbootjwtlongs7.entity.User;
import com.longs7.springbootjwtlongs7.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
