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
public class Status implements Serializable {

    @Id
    private long statusId;

    private String StatusName;

    public Status() {
    }

    public long getStatusId() {
        return statusId;
    }

    public void setStatusId(long statusId) {
        this.statusId = statusId;
    }

    public String getStatusName() {
        return StatusName;
    }

    public void setStatusName(String StatusName) {
        this.StatusName = StatusName;
    }

    @Override
    public String toString() {
        return "Status{" + "statusId=" + statusId + ", StatusName=" + StatusName + '}';
    }

}
