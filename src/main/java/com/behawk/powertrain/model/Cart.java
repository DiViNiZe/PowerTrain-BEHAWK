package com.behawk.powertrain.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import java.io.Serializable;



@Entity
@Table(name="cart")
public class Cart implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long  id;
    private float totalPrice;
    
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
}