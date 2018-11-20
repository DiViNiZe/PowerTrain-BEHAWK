/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.controller;

import com.behawk.powertrain.model.Address;
import com.behawk.powertrain.model.Order;
import com.behawk.powertrain.model.User;
import com.behawk.powertrain.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Supakorn
 */
@CrossOrigin(origins = "*")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private Address address;

    @PatchMapping("/order/address/{orderId}")
    public Address getOrderAddress(@PathVariable long id){
        Order targetOrder = orderService.getOrderById(id);
        User userOfTheOrder = targetOrder.getUser();
        return null;
    }
}
