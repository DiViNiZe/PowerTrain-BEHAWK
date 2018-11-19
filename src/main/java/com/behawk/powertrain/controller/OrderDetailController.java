/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.controller;

import com.behawk.powertrain.model.OrderDetail;
import com.behawk.powertrain.model.Product;
import com.behawk.powertrain.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Supakorn
 */
@RestController

public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;
    

    @PostMapping("/cart/orderdetail/{userId}")
    public OrderDetail createOrder(@PathVariable long userId,@RequestBody Product product){
        return null;
    }

    @PatchMapping("/cart/orderdetail")
    public OrderDetail updateOrderDetailQty(@RequestBody OrderDetail orderDetailBody) {
        OrderDetail orderDetail = orderDetailService.UpdateOrderDetailQty(orderDetailBody);
        return orderDetail;
    }
    
    @DeleteMapping("/cart/orderdetail/{orderDetailId}")
    public boolean removeItemOnCart(@PathVariable long orderDetailId){
        orderDetailService.removeItemOnCart(orderDetailId);
        return true;
    }
}
