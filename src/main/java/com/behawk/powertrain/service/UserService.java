/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.service;

import com.behawk.powertrain.Repository.UserRepository;
import com.behawk.powertrain.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author varavut
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    public User getUserById(long id) {
        return userRepository.getOne(id);
    }

    public User createUser(User user){
        return null;
    }
}
