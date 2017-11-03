package com.bead.netkaja.repository;

import com.bead.netkaja.model.Customer;
import com.bead.netkaja.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("SELECT o.customer from Order o where o.customer = ?#{[0]}")
    Optional<Order> findByCustomer(Customer customer);
}