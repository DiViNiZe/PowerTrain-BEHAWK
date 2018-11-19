package com.behawk.powertrain.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Table(name = "users")
public class User extends SerializableSerializer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    private String firstName;

    private String lastName;

    @UniqueElements
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @OneToOne(fetch=FetchType.EAGER,targetEntity=Cart.class)
    @JoinColumn(name="id")
    private Cart cart;

    private String email;

    private String phoneNumber;

    public User() {
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Cart getCart() {
        return this.cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", password=" + password + ", email=" + email + ", phoneNumber=" + phoneNumber + '}';
    }

}
