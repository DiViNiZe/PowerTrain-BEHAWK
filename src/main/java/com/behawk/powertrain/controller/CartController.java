/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.controller;

import com.behawk.powertrain.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Supakorn
 */
@RestController


public class CartController {
    @Autowired
    private CartService cartService;
    
    @PatchMapping("/cart/orderline/{orderLineId}")
    public void updateOrderQuantity(long userId,int productQuantity){
        cartService.updateQuantity(userId, productQuantity);
    }
}
