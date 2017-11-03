package com.bead.netkaja.repository;

import com.bead.netkaja.model.Customer;
import com.bead.netkaja.model.Order;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    
    @Query("SELECT o.customer from Order o where o.customer = ?#{[0]}")
    List<Order> findByCustomer(Customer customer);
}
