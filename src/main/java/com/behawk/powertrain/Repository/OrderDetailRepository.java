/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.Repository;

import com.behawk.powertrain.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Supakorn
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {

    

}
