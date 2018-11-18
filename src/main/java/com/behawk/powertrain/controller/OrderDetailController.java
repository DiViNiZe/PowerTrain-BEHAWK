/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.controller;

import com.behawk.powertrain.model.OrderDetail;
import com.behawk.powertrain.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @PatchMapping("/cart/orderdetail/{orderDetailId}")
    public OrderDetail updateOrderDetailQty(@PathVariable long orderDetailId, @RequestBody(required = false) OrderDetail orderDetailBody) {
        int orderDetailQty = orderDetailBody.getQuantity();
        System.out.println("");
        OrderDetail orderDetail = orderDetailService.UpdateOrderDetailQty(orderDetailId, orderDetailQty);
        return orderDetail;
    }
}
