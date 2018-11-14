package com.behawk.powertrain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.UniqueElements;


@Entity
public class User{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @UniqueElements
    @NotBlank
    private String username;

    @NotBlank
    private String password;
    
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }
    
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            "}";
    }
}