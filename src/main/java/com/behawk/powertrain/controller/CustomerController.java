package com.behawk.powertrain.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.behawk.powertrain.model.Customer;
import com.behawk.powertrain.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CustomerController{

    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable long customerId){
        return null;
    }

    @PostMapping("/customer/{id}")
    public ResponseEntity<Customer> createCustomerByUserId(
        @PathVariable long userId,
        @RequestBody Customer newCustomer){
        return null;
    }

    @DeleteMapping("/customer/{id}")
    public ResponseEntity<Customer> deleteCustomerByUserId(){
        return null;
    }
    
}