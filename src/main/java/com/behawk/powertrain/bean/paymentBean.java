/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Sinn
 */
@Configuration
public class paymentBean {
    
    @Value("${secretkey}")
    private String SECRET_KEY;
    
    @Value("${publickey}")
    private String PUBLIC_KEY;
    
}
