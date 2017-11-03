package com.bead.netkaja.service.interf;

import com.bead.netkaja.model.Allergens;

import java.util.Optional;

public interface AllergensService extends CRUDService<Allergens>{
    Allergens findByName(String name);

    Allergens findByNumber(Integer number);
}
