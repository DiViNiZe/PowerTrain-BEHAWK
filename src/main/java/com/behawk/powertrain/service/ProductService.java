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

    public void deleteProductById(long id) {
        Product targetProduct = findProductById(id);
        productRepository.delete(targetProduct);
    }

    public ResponseEntity<List<Product>> findByProductNameIgnoreCase(String productName) {
        if (productRepository.existsByProductName(productName) == false) {
            return new ResponseEntity<List<Product>>(new ArrayList<Product>(), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<List<Product>>(productRepository.findByProductNameIgnoreCase(productName), HttpStatus.OK);
        }
    }

}
