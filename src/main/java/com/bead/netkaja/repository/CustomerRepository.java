package com.bead.netkaja.repository;

import java.util.Optional;

import com.bead.netkaja.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByEmail(String email);

    Optional<Customer> findByName(String name);

    Optional<Customer> findById(String id);

    Optional<Customer> findByphoneNumber(String phoneNumber);

    Optional<Customer> findByAddress(String address);

    Optional<Customer> findByUserName(String username);

    Optional<Customer> findByUserNameAndPassword(String username, String password);
}
