package com.bead.netkaja.service.imp;

import com.bead.netkaja.model.Allergens;
import com.bead.netkaja.repository.AllergensRepository;
import com.bead.netkaja.service.interf.AllergensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpAllergensService implements AllergensService {
    @Autowired
    private AllergensRepository allergensRepository;

    @Override
    public Allergens create(Allergens allergens) {
        return allergensRepository.save(allergens);
    }

    @Override
    public Allergens delete(Allergens allergens) {
        allergensRepository.delete(allergens);
        return allergens;
    }

    @Override
    public Allergens update(Allergens allergens) {
        return allergensRepository.save(allergens);
    }

    @Override
    public List<Allergens> list() {
        return allergensRepository.findAll();
    }

    @Override
    public Allergens findByName(String name) {
        return allergensRepository.findByName(name).get();
    }

    @Override
    public Allergens findByNumber(Integer number) {
        return allergensRepository.findByNumber(number).get();
    }
}
