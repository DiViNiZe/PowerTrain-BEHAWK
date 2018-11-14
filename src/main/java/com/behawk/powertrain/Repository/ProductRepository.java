/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.Repository;

import com.behawk.powertrain.model.Product;
<<<<<<< Updated upstream
=======
import java.util.List;
>>>>>>> Stashed changes
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vuttichai
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findByProductNameIgnoreCase(String productName); 
}
