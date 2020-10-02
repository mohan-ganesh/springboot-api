package com.example.user.demo.controller;


import com.example.user.demo.api.UserAPI;
import com.example.user.demo.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    public static Logger logger =  LoggerFactory.getLogger(SampleController.class);

    @Autowired
    UserAPI userApi;

    @GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> greeting(@RequestParam(required = false) String userId) {
        logger.info("start");
        User user = userApi.getUserDetails(userId);
        logger.info("userapi reference -  "+userApi );
        logger.info("user reference -  "+user );

        logger.info("end");
        return ResponseEntity.ok(user);

    }

}
