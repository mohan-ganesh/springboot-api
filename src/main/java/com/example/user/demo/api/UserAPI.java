package com.example.user.demo.api;

import com.example.user.demo.pojo.Address;
import com.example.user.demo.pojo.User;

/**
 *
 */

public interface UserAPI {

    /**
     *
     * @param id
     * @return
     */
    public User getUserDetails(String id);


    /**
     *
     * @param id
     * @return
     */
    public default Address getAddress(String id) {

        Address address =new Address(id);
        return address;
    }



}


