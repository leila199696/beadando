package com.bead.netkaja.repository;

import com.bead.netkaja.model.Food;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends CrudRepository<Food, Long>{
    Optional<Food> findByName(String name);
}
