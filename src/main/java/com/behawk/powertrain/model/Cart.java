package com.behawk.powertrain.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;



@Entity
@Table(name="cart")
public class Cart extends SerializableSerializer{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private float price;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}