package com.bead.netkaja.repository;

import com.bead.netkaja.model.Allergen;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllergenRepository extends JpaRepository<Allergen, Long> {
    Optional<Allergen> findByName(String name);

    Optional<Allergen> findByNumber(Integer number);
}
