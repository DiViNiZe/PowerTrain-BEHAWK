/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.service;

import java.util.List;

import com.behawk.powertrain.Repository.OrderRepository;
import com.behawk.powertrain.model.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Supakorn
 */
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(Order order){
        return orderRepository.save(order);
    }
    
    public Order updateOrder(Order order){
        return orderRepository.save(order);
    }

    public List<Order> getAllOrder(){
        return orderRepository.findAll();
    }

    public Order getOrderById(long id){
        return orderRepository.getOne(id);
    }

    public void deleteOrder(long id){
        Order targetOrder = getOrderById(id);
        orderRepository.delete(targetOrder);
    }

}
