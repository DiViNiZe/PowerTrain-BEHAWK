/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.service;

import com.behawk.powertrain.Repository.ProductRepository;
import com.behawk.powertrain.model.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vuttichai
 */
@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    public List<Product> findByProductNameIgnoreCase(String productName){
        return productRepository.findByProductNameIgnoreCase(productName);
    }
}
