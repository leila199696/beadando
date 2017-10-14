package com.bead.repository;

import com.bead.netkaja.model.Customer;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepositry extends CrudRepository<Customer, Long>{
    Optional<Customer> findByEmail(String email);

    Optional<Customer> findByName(String name);

    Optional<Customer> findByPhonenumber(String phoneNumber);
    
    Optional<Customer> findByAddress(String address);
}
