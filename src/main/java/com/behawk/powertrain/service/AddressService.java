package com.behawk.powertrain.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import com.behawk.powertrain.Repository.AddressRepository;
import com.behawk.powertrain.Repository.CartRepository;
import com.behawk.powertrain.model.Address;
import com.behawk.powertrain.model.Cart;
import com.behawk.powertrain.model.Order;
import com.behawk.powertrain.model.OrderDetail;
import com.behawk.powertrain.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Supakorn
 */
@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address setAddressById(Address newAddress){
        return addressRepository.save(newAddress);
    }
}