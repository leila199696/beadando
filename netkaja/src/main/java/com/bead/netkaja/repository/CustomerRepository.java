package com.bead.netkaja.repository;

import com.bead.netkaja.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByEmail(String email);

    Optional<Customer> findByName(String name);

    Optional<Customer> findByphoneNumber(String phoneNumber);
    
    Optional<Customer> findByAddress(String address);

    Optional<Customer> findByUsername(String username);

    Optional<Customer> findByUsernameAndPassword(String username, String password);
}
