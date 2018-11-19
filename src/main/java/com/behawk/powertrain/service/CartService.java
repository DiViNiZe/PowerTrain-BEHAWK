/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.service;

import java.util.List;

import com.behawk.powertrain.Repository.CartRepository;
import com.behawk.powertrain.model.Cart;
import com.behawk.powertrain.model.Order;
import com.behawk.powertrain.model.OrderDetail;
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
        return cartRepository.findByUserUserId(id);
    }

    public Cart addProductById(long productId,long userId){
        Cart userCart = cartRepository.findByUserUserId(userId);
        Order userOrder = userCart.getOrder();
        if(userOrder != null){
            Product targetProduct = productService.findProductById(productId);
            List<OrderDetail> orderDetails = userOrder.getOrderDetail();
            OrderDetail newItemToCart = new OrderDetail();
            newItemToCart.setProduct(targetProduct);
            newItemToCart.setQuantity(1);
            newItemToCart.setTotalPrice(targetProduct.getPrice()*newItemToCart.getQuantity());
            orderDetails.add(newItemToCart);
            userOrder.setOrderDetail(orderDetails);
            userCart.setOrder(userOrder);
            return cartRepository.save(userCart);
        }else{
            userOrder = new Order();
            Product targetProduct = productService.findProductById(productId);
            List<OrderDetail> orderDetails = userOrder.getOrderDetail();
            OrderDetail newItemToCart = new OrderDetail();
            newItemToCart.setProduct(targetProduct);
            newItemToCart.setQuantity(1);
            newItemToCart.setTotalPrice(targetProduct.getPrice()*newItemToCart.getQuantity());
            orderDetails.add(newItemToCart);
            userOrder.setOrderDetail(orderDetails);
            userCart.setOrder(userOrder);
            return cartRepository.save(userCart);
        }
    }
}