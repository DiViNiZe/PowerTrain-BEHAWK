/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author vuttichai
 */
@Entity
public class Shipment implements Serializable {

    @Id
    private long shipmentid;

    private String shipmentType;

    private Double shipmentCost;

    private String shipmentTrackingId;

    public Shipment() {
    }

    /**
     * @return the shipmentTrackingId
     */
    public String getShipmentTrackingId() {
        return shipmentTrackingId;
    }

    /**
     * @param shipmentTrackingId the shipmentTrackingId to set
     */
    public void setShipmentTrackingId(String shipmentTrackingId) {
        this.shipmentTrackingId = shipmentTrackingId;
    }

    public long getShipmentid() {
        return shipmentid;
    }

    public void setShipmentid(long shipmentid) {
        this.shipmentid = shipmentid;
    }

    public String getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
    }

    public Double getShipmentCost() {
        return shipmentCost;
    }

    public void setShipmentCost(Double shipmentCost) {
        this.shipmentCost = shipmentCost;
    }

    @Override
    public String toString() {
        return "Shipment{" + "shipmentid=" + shipmentid + ", shipmentType=" + shipmentType + ", shipmentCost=" + shipmentCost + '}';
    }

}
