package com.example.user.demo.api.impl;

import com.example.user.demo.api.UserAPI;
import com.example.user.demo.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserApiImpl implements UserAPI {


    @Override
    public User getUserDetails(String id) {
        User user;
        if (id.equals("mohan")) {
             user = new User("mohan", "mohan@domaim.com");
        } else {
             user = new User("anup", "anup@domaim.com");
        }
        return user;
    }
}
