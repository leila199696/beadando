package com.bead.netkaja.service.interf;

import com.bead.netkaja.model.Allergen;
import com.bead.netkaja.model.Food;

import java.util.List;

public interface FoodService extends CRUDService<Food> {
    List<Allergen> listAllergenicFood();

    Food findByName(String name);
}
