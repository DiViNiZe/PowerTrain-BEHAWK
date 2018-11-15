/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.Repository;

import com.behawk.powertrain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author varavut
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUsername(String username);
}
