package com.behawk.powertrain.controller;

import org.springframework.web.bind.annotation.RestController;

import com.behawk.powertrain.model.Address;
import com.behawk.powertrain.model.User;
import com.behawk.powertrain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "*")
@RestController
public class UserController {
    
    @Autowired
    private UserService userService ;
    

    @PostMapping(value="/user/login")
    public ResponseEntity<User> authenUser(@RequestBody User inputUser) { 
        return new ResponseEntity<User>(userService.longinUser(inputUser),HttpStatus.OK);
    }
    
    @PostMapping(value="/user")
    public ResponseEntity<User> createUser(@RequestBody User inputUser) { 
        User user = userService.createUser(inputUser);
        return new ResponseEntity<User>(user,HttpStatus.OK);
    }
    
    @PostMapping(value="/user/address/{userId}")
    public ResponseEntity<User> updateUserAddress(@RequestParam long userId, @RequestBody Address inputAddress) {
        User user = userService.getUserById(userId);
        user.setAddress(inputAddress);
        return new ResponseEntity<User>(user,HttpStatus.OK);
    }


}