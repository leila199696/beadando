package com.bead.netkaja.service.interf;

import com.bead.netkaja.model.Allergen;

public interface AllergenService extends CRUDService<Allergen>{
    Allergen findByName(String name);

    Allergen findByNumber(Integer number);
}
