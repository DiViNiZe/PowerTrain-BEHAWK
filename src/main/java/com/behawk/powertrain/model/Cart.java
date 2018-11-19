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
public class Cart extends SerializableSerializer{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    