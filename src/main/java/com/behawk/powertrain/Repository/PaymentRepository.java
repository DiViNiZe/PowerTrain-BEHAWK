
package com.behawk.powertrain.Repository;

import com.behawk.powertrain.model.Payment;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author divinize
 */
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}