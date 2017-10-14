package com.bead.repository;

import com.bead.netkaja.model.Customer;
import com.bead.netkaja.model.Order;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long>{
    
    @Query("SELECT o.customer from Order o where o.customer = ?#{[0]}")
    Optional<Order> findByCustomer(Customer customer);
}
