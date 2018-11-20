package com.behawk.powertrain.service;

import com.behawk.powertrain.Repository.PaymentRepository;
import com.behawk.powertrain.Repository.ProductRepository;
import com.behawk.powertrain.model.Payment;
import com.behawk.powertrain.model.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

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