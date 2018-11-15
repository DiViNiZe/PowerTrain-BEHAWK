/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.controller;


import com.behawk.powertrain.model.Product;
import com.behawk.powertrain.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author vuttichai
 */
@RestController
@RequestMapping()
public class SearchController {
    @Autowired
    ProductService productService;
    
    @GetMapping("/search?title={title}")
    public List<Product> search(@RequestParam String productName){
        if(productName == null){
            List<Product> products = productService.searchProduct();
            return products;
        }
        return productService.findByProductNameIgnoreCase(productName);
        
    }
            

}
