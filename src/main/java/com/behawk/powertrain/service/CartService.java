/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import com.behawk.powertrain.Repository.CartRepository;
import com.behawk.powertrain.model.Cart;
import com.behawk.powertrain.model.Order;
import com.behawk.powertrain.model.OrderDetail;
import com.behawk.powertrain.model.Payment;
import com.behawk.powertrain.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Supakorn
 */
@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ProductService productService;

    public Cart getCartByUserId(long id){
        Cart targetCart = cartRepository.findByUserUserId(id);
        System.out.println("**************************");
        System.out.println(targetCart.toString());
        return targetCart;
    }

    public Cart addProductById(long productId,long userId){
        Product targetProduct = productService.findProductById(productId);
        Cart userCart = getCartByUserId(userId);
        Order cartOrder = userCart.getOrder();
        cartOrder.setDateCreated(new Date());
        cartOrder.setStatus("INCART");
        cartOrder.setPayment(new Payment());
        List<OrderDetail> orderDetails = null;
        try{
            orderDetails = cartOrder.getOrderDetail();
        }catch(Exception e){
            orderDetails = new ArrayList<OrderDetail>();
        }
        if(orderDetails == null){
            orderDetails = new ArrayList<OrderDetail>();
        }
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setTotalPrice(100.00);
        System.out.println("************OrderPrice***************");
        System.out.println(orderDetail.getTotalPrice());
        orderDetail.setProduct(targetProduct);
        orderDetail.setQuantity(1);
        orderDetails.add(orderDetail);
        cartOrder.setOrderDetail(orderDetails);
        userCart.setOrder(cartOrder);
        return cartRepository.save(userCart);
    }

    public Cart createCart(Cart cart){
        return cartRepository.save(cart);
    }
}