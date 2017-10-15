package com.bead.netkaja.service.interf;

import com.bead.netkaja.model.Allergens;
import com.bead.netkaja.model.Food;

import java.util.List;

public interface FoodService extends CRUDService<Food>{
    List<Allergens> listAllergenicFood();
    Food findByName(String name);
}
