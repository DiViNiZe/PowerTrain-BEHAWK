package com.behawk.powertrain.service;

import co.omise.Client;
import co.omise.ClientException;
import com.behawk.powertrain.Repository.PaymentRepository;
import com.behawk.powertrain.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vuttichai
 */
@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;
    private Client client;
    public PaymentService(String publicKey, String secretKey) throws ClientException {
        client = new Client(publicKey, secretKey);
    }

    public Payment updatePayment(Payment payment){
        return paymentRepository.save(payment);
    }
    
}