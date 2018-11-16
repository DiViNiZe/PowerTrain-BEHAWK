package com.behawk.powertrain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

//import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import java.io.Serializable;

@Entity
public class Category implements Serializable {

    @Id
    private long cetagoryId;

    @NotBlank
    private String name;

    private String descrioption;

    public Category() {
    }

    public long getCetagoryId() {
        return cetagoryId;
    }

    public void setCetagoryId(long cetagoryId) {
        this.cetagoryId = cetagoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrioption() {
        return descrioption;
    }

    public void setDescrioption(String descrioption) {
        this.descrioption = descrioption;
    }

    @Override
    public String toString() {
        return "Category{" + "cetagoryId=" + cetagoryId + ", name=" + name + ", descrioption=" + descrioption + '}';
    }

}
