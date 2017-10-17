<<<<<<< HEAD
package com.bead.netkaja.repository;

import com.bead.netkaja.model.Food;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends CrudRepository<Food, Long>{
    Optional<Food> findByName(String name);
}
=======
package com.bead.netkaja.repository;

import com.bead.netkaja.model.Allergens;
import com.bead.netkaja.model.Food;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    Optional<Food> findByName(String name);

    @Query("SELECT f.allergens from Food f")
    List<Allergens> listAllergens();
}
>>>>>>> d3a942757b25125dbd5d47cbbc43baf08df1d5d1
