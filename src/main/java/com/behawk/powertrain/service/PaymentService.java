package com.behawk.powertrain.service;

import co.omise.Client;
import co.omise.ClientException;
import co.omise.models.Charge;
import com.behawk.powertrain.Repository.OrderRepository;
import com.behawk.powertrain.Repository.PaymentRepository;
import com.behawk.powertrain.model.Order;
import com.behawk.powertrain.model.OrderDetail;
import com.behawk.powertrain.model.Payment;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author vuttichai
 */
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;
    private Client client;
    
    @Autowired
    private OrderRepository orderRepository;
    
    public PaymentService(String publicKey, String secretKey) throws ClientException {
        this.client = new Client(publicKey, secretKey);
    }
    
    public Payment updatePayment(Payment payment){
        return paymentRepository.save(payment);
    }
    
    public boolean confirmPayment(String paymentToken, Order order){
        boolean result = false;
        List<OrderDetail> detail = order.getOrderDetail();
        double money = 0;
        for(OrderDetail od : detail){
            money+=od.getTotalPrice();
        }
        try{
            Charge charge = client.charges().create(
                                new Charge.Create()
                                        .amount((long) money)
                                        .currency("THB")
                                        .card(paymentToken)
                            );
            result = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}