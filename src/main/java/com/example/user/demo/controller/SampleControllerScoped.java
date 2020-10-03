package com.example.user.demo.controller;


import com.example.user.demo.api.UserAPI;
import com.example.user.demo.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

/**
 *
 */

@RestController
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SampleControllerScoped {

    public static Logger logger =  LoggerFactory.getLogger(SampleControllerScoped.class);


    @Autowired
    UserAPI userApi;

    @GetMapping(value = "/scope", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> greeting(@RequestParam(required = false) String userId) {
        logger.info("SampleController - "+this);

        User user = userApi.getUserDetails(userId);

        user.setControllerRef(this.toString());
        user.setApiRef(userApi.toString());
        user.setPrintme("New  Instance for every request of the controller");

        logger.info("userapi reference -  "+userApi );
        logger.info("user reference -  "+user );

        logger.info("end");
        return ResponseEntity.ok(user);

    }

}
