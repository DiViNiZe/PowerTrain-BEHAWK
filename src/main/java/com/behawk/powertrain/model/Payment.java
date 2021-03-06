/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Supakorn
 */
@Entity
public class Payment implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long paymentId;

    private String paymentType;

    private String paymentToken;

    public long getPaymentId() {
        return paymentId;
    }

    /**
     * @return the paymentToken
     */
    public String getPaymentToken() {
        return paymentToken;
    }

    /**
     * @param paymentToken the paymentToken to set
     */
    public void setPaymentToken(String paymentToken) {
        this.paymentToken = paymentToken;
    }

    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Payment{" + "paymentId=" + paymentId + ", paymentType=" + paymentType + '}';
    }

}
