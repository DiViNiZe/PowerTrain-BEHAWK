package com.behawk.powertrain.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


import java.io.Serializable;

import org.hibernate.validator.constraints.UniqueElements;


@Entity
@Table(name="customers")
public class Customer implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    @NotBlank
    private String customerName;

    @NotBlank
    private String customerSurname;
    
    @NotBlank
    private String email;

    @NotNull
    private int phone;

    @NotBlank
    @OneToOne
    private User user;

    @NotBlank
    private Cart shoppingCart;

    @NotBlank
    @OneToMany(fetch=FetchType.EAGER ,cascade=CascadeType.DETACH)
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
