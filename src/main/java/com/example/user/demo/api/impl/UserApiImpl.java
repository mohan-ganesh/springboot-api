package com.example.user.demo.api.impl;

import com.example.user.demo.api.UserAPI;
import com.example.user.demo.pojo.Address;
import com.example.user.demo.pojo.User;
import org.springframework.stereotype.Component;

/**
 *
 */

@Component
public class UserApiImpl implements UserAPI {


    @Override
    public User getUserDetails(String id) {
        User user;
        if (id.equals("id")) {
             user = new User("id", "id@domaim.com");
        } else {
             user = new User("unknown", "unknown@domaim.com");
        }
        Address address = getAddress(id);
        user.setAddress(address);
        return user;
    }
}
