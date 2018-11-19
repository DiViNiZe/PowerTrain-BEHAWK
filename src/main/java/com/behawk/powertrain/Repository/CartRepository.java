
package com.behawk.powertrain.Repository;

import com.behawk.powertrain.model.Cart;
import com.behawk.powertrain.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author benz
 */
public interface CartRepository extends JpaRepository<Cart, Long> {

}