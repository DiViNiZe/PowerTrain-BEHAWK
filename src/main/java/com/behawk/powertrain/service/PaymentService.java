package com.behawk.powertrain.service;

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

    public Payment updatePayment(Payment payment){
        return paymentRepository.save(payment);
    }
}