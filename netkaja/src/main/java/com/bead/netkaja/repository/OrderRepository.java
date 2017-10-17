<<<<<<< HEAD
package com.bead.netkaja.repository;

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
=======
package com.bead.netkaja.repository;

import com.bead.netkaja.model.Customer;
import com.bead.netkaja.model.Order;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    
    @Query("SELECT o.customer from Order o where o.customer = ?#{[0]}")
    Optional<Order> findByCustomer(Customer customer);
}
>>>>>>> d3a942757b25125dbd5d47cbbc43baf08df1d5d1
