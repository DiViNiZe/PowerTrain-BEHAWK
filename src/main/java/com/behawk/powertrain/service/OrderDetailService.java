/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.service;

import com.behawk.powertrain.Repository.OrderDetailRepository;
import com.behawk.powertrain.model.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Supakorn
 */
@Service
public class OrderDetailService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    public OrderDetail UpdateOrderDetailQty(OrderDetail newOrderDetail) {
        return orderDetailRepository.save(newOrderDetail);
    }
    
    public boolean removeItemOnCart(long orderDetailId){
        orderDetailRepository.deleteById(orderDetailId);
        if(orderDetailRepository.existsById(orderDetailId)==false){
            return true;
        }else{
            return false;
        }
    }
}
