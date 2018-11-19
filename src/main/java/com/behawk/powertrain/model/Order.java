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

    
    @ManyToOne(optional=true,targetEntity=Status.class)
    @JoinColumn(name="statusId")
    private Status status;
    
    @ManyToOne(optional=false,targetEntity=User.class)
    @JoinColumn(name="userId")
    private User user;
    
    @OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.REMOVE,targetEntity=OrderDetail.class)
    private List<OrderDetail> orderDetail;
    
    public long getOrderId() {
        return orderId;
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

    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + ", dateCreated=" + dateCreated + ", dateShipped=" + dateShipped + '}';
    }
    
}
