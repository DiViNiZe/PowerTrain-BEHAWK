package com.behawk.powertrain.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;

import org.hibernate.validator.constraints.UniqueElements;


@Entity
public class Customer extends SerializableSerializer{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String customerName;
    private String customerSurname;
    private String email;
    private int phone;
    private User user;
    private Cart shoppingCart;
    private List<Product> product;
    
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getCustomerName() {
        return this.customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public String getCustomerSurname() {
        return this.customerSurname;
    }
    
    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getPhone() {
        return this.phone;
    }
    
    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    public Cart getShoppingCart() {
        return this.shoppingCart;
    }
    
    public void setShoppingCart(Cart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    
    public List<Product> getProduct() {
        return this.product;
    }
    
    public void setProduct(List<Product> product) {
        this.product = product;
    }
    

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", customerName='" + getCustomerName() + "'" +
            ", customerSurname='" + getCustomerSurname() + "'" +
            ", email='" + getEmail() + "'" +
            ", phone='" + getPhone() + "'" +
            ", user='" + getUser() + "'" +
            ", shoppingCart='" + getShoppingCart() + "'" +
            ", product='" + getProduct() + "'" +
            "}";
    }

}
