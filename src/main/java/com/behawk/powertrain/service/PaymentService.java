package com.behawk.powertrain.service;

import co.omise.Client;
import co.omise.ClientException;
import com.behawk.powertrain.Repository.OrderRepository;
import com.behawk.powertrain.Repository.PaymentRepository;
import com.behawk.powertrain.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vuttichai
 */
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;
    private Client client;
    
    @Autowired
    private OrderRepository order;
    
    public PaymentService(String publicKey, String secretKey) throws ClientException {
        this.client = new Client(publicKey, secretKey);
    }
    
    public Payment updatePayment(Payment payment){
        return paymentRepository.save(payment);
    }
    
    public boolean confirmPayment(String paymentToken, long orderId){
        // order.;
        return false;
    }
    
    
}