package com.behawk.powertrain.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.behawk.powertrain.model.Order;
import com.behawk.powertrain.model.Payment;
import com.behawk.powertrain.model.Product;
import com.behawk.powertrain.service.OrderService;
import com.behawk.powertrain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "*")
@RestController
public class PaymentController {

    @Autowired
    private OrderService orderService;


    @GetMapping("/payment/{orderId}")
    public Payment getPaymentByOrderId(@PathVariable long orderId){
        Order targetOrder = orderService.getOrderById(orderId);
        Payment payment = targetOrder.getPayment();
        if(payment == null){
            return new Payment();
        }else{
            return payment;
        }
    }

    @PostMapping("/payment/{orderId}")
    public Payment addPayment(@PathVariable long orderId,@RequestBody Payment payment){
        Order targetOrder = orderService.getOrderById(orderId);
        targetOrder.setPayment(payment);
        return orderService.updateOrder(targetOrder).getPayment();
    }

}