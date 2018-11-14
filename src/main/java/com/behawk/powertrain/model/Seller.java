/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.model;

import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Supakorn
 */
@Entity
public class Seller extends SerializableSerializer{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long sellerId;
    
    private String sellerName;
    
    private String sellerSname;
    
    private String email;
    
    private String phone;

    public Seller() {
        
    }
    
    
    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerSname() {
        return sellerSname;
    }

    public void setSellerSname(String sellerSname) {
        this.sellerSname = sellerSname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}
