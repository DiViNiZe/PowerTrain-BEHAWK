/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.service;

import javax.transaction.Transactional;

import com.behawk.powertrain.Repository.CartRepository;
import com.behawk.powertrain.Repository.UserRepository;
import com.behawk.powertrain.model.Address;
import com.behawk.powertrain.model.Cart;
import com.behawk.powertrain.model.Order;
import com.behawk.powertrain.model.Payment;
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
    
    @Autowired
    private CartService cartService;

    public User getUserById(long id) {
        return userRepository.getOne(id);
    }

    public User longinUser(User user){
        User targetUser = getUserByFbId(user.getFbId());
        if(targetUser == null){
            targetUser = createUser(user);
        }
        return targetUser;
    }

    public User getUserByFbToken(String token){
        return userRepository.findByFbAccessToken(token);
    }

    public User getUserByFbId(String fbId){
        return userRepository.findByFbId(fbId);
    }

    public User createUser(User user){
        user.setAddress(new Address());
        Cart newCart = new Cart();
        Order userOrder = new Order();
        userOrder.setUser(user);
        userOrder.setPayment(new Payment());
        newCart.setOrder(userOrder);
        newCart.setUser(user);
        user.setCart(newCart);
        System.out.println("**********USER***********");
        System.out.println(user.toString());
        return userRepository.save(user);
    }
}
