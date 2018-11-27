package com.behawk.powertrain.controller;

import com.behawk.powertrain.Repository.CategoryRepository;
import com.behawk.powertrain.model.Cart;
import com.behawk.powertrain.model.Category;
import com.behawk.powertrain.service.CartService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author benz
 */
@CrossOrigin(origins = "*")
@RestController
public class CartController {

    @Autowired
    private CartService cartService;
    
    @GetMapping("/cart/{userId}")
    public Cart getCartByUserId(@PathVariable long userId){
        return cartService.getCartByUserId(userId);
    }

    @PostMapping("/cart/{userId}")
    public Cart addToCartByUserId(
        @PathVariable long userId,
        @RequestParam("product_id") long productId){
        System.out.println("userid: "+userId);
        System.out.println("product: "+productId);
            return cartService.addProductById(productId, userId);
    }
}