package com.behawk.powertrain.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.behawk.powertrain.model.Order;
import com.behawk.powertrain.model.Payment;
import com.behawk.powertrain.service.OrderService;
import com.behawk.powertrain.service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "*")
@RestController
public class PaymentController {

    @Autowired
    private OrderService orderService;
    
    @Autowired
    PaymentService paymentService;
    
    @PostMapping("/payment")
    public boolean payment(@RequestBody String paymentToken,@RequestBody long orderId){
        return paymentService.confirmPayment(paymentToken, orderId);
    }
    
}