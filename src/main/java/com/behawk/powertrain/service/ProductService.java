/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.service;

import com.behawk.powertrain.Repository.ProductRepository;
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
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    public Product findProductById(long id) {
        return productRepository.getOne(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public boolean deleteProductById(long id){
        Product targetProduct = findProductById(id);
        productRepository.delete(targetProduct);
        return true;
    }

    public ResponseEntity<List<Product>> findByProductName(String productName) {
        List<Product> products  = productRepository.findByProductName(productName);
        if (products.size()==0) {
            return new ResponseEntity<List<Product>>(products, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    
    }

}
