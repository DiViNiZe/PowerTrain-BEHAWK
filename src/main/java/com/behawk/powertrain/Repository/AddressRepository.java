
package com.behawk.powertrain.Repository;

import com.behawk.powertrain.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author divinize
 */
public interface AddressRepository extends JpaRepository<Address, Long> {
    
//    @Query("update from User u where u.emailAddress = ?1")
//    public Address updateAddressDetailById(int id);
}