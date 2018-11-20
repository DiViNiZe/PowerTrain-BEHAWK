/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author Supakorn
 */
@Entity
@Table(name = "orders")
       
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    
    @Basic
    @Temporal(TemporalType.TIME)
    private Date dateShipped;

    private String status;
    
    @ManyToOne(optional=false,targetEntity=User.class,cascade=CascadeType.ALL)
    @JoinColumn(name="userId")
    private User user;
    
    @OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL,targetEntity=OrderDetail.class)
    private List<OrderDetail> orderDetail;

    @OneToOne(optional=false,targetEntity=Payment.class,cascade=CascadeType.ALL)
    @JoinColumn(name="paymentId")
    private Payment payment;

    
    
    public long getOrderId() {
        return orderId;
    }
    
    
    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }
    
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public Date getDateShipped() {
        return this.dateShipped;
    }
    
    public void setDateShipped(Date dateShipped) {
        this.dateShipped = dateShipped;
    }
    
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    public List<OrderDetail> getOrderDetail() {
        return this.orderDetail;
    }
    
    public void setOrderDetail(List<OrderDetail> orderDetail) {
        this.orderDetail = orderDetail;
    }
    
    public Payment getPayment() {
        return this.payment;
    }
    
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    
    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + ", dateCreated=" + dateCreated + ", dateShipped=" + dateShipped + '}';
    }
    
}
