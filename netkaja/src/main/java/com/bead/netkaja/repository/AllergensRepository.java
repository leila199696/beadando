package com.bead.netkaja.repository;

import com.bead.netkaja.model.Allergens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AllergensRepository extends JpaRepository<Allergens, Long> {
    Optional<Allergens> findByName(String name);
    
    Optional<Allergens> findByNumber(Integer number);
}
