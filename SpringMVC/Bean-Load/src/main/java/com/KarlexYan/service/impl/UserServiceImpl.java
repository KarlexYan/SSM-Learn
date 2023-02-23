package com.KarlexYan.service.impl;

import com.KarlexYan.domain.User;
import com.KarlexYan.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {
        System.out.println("user service save...");
    }
}
