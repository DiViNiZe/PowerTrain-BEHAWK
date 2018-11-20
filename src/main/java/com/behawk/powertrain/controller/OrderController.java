/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.controller;

import com.behawk.powertrain.model.Address;
import com.behawk.powertrain.model.Order;
import com.behawk.powertrain.model.User;
import com.behawk.powertrain.service.AddressService;
import com.behawk.powertrain.service.OrderService;
import com.behawk.powertrain.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
    private AddressService addressService;
    

    @GetMapping("/order/address/{orderId}")
    public Address getOrderAddress(@PathVariable long orderId){
        Order targetOrder = orderService.getOrderById(orderId);
        User userOfTheOrder = targetOrder.getUser();
        Address orderAddress = userOfTheOrder.getAddress();
        if(orderAddress == null){
            return new Address();
        }else{
            return orderAddress;
        }
    }

    @PostMapping("/order/address")
    public Address addAddressToOrder(@RequestBody Address address){
        return addressService.saveAddress(address);
    }

    @PatchMapping("/order/status/{orderId}")
    public Order updateOrderStatus(@PathVariable long orderId,@RequestParam("status") String status){
        Order targetOrder = orderService.getOrderById(orderId);
        targetOrder.setStatus(status);
        return orderService.updateOrder(targetOrder);
    }

    @PatchMapping("/order/confirm/{orderId}")
    public Order confirmOrder(@PathVariable long orderId){
        Order targetOrder = orderService.getOrderById(orderId);
        if(targetOrder.getStatus() == "INCART"){
            targetOrder.setStatus("CONFIRM");
        }
        return orderService.updateOrder(targetOrder);
    }
}
