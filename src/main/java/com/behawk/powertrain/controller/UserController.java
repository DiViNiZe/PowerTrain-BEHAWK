package com.behawk.powertrain.controller;

import org.springframework.web.bind.annotation.RestController;

import com.behawk.powertrain.model.User;
import com.behawk.powertrain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {
    
    @Autowired
    private UserService userService ;
    

    @PostMapping(value="/user/login")
    public ResponseEntity<User> authenUser(@RequestBody User inputUser) { 
        return null;
    }
    
    @PostMapping(value="/user")
    public ResponseEntity<User> createUser(@RequestBody User inputUser) { 
        return null;
    }

}