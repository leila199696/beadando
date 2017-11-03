package com.bead.netkaja.repository;

import com.bead.netkaja.model.Allergens;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllergensRepository extends JpaRepository<Allergens, Long> {
    Optional<Allergens> findByName(String name);
    
    Optional<Allergens> findByNumber(Integer number);
}
