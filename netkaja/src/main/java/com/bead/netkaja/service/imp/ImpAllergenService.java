package com.bead.netkaja.service.imp;

import com.bead.netkaja.model.Allergen;
import com.bead.netkaja.repository.AllergenRepository;
import com.bead.netkaja.service.interf.AllergenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ImpAllergenService implements AllergenService {
    @Autowired
    private AllergenRepository allergenRepository;

    @Override
    public Allergen create(Allergen allergen) {
        return allergenRepository.save(allergen);
    }

    @Override
    public Allergen delete(Allergen allergen) {
        allergenRepository.delete(allergen);
        return allergen;
    }

    @Override
    public Allergen update(Allergen allergen) {
        return allergenRepository.save(allergen);
    }

    @Override
    public List<Allergen> list() {
        return allergenRepository.findAll();
    }

    @Override
    public Allergen findByName(String name) {
        try{
            return allergenRepository.findByName(name).get();
        }catch (NoSuchElementException e){
            System.out.println("Nincs ilyen elem");
        }
        return null;
    }

    @Override
    public Allergen findByNumber(Integer number) {
        return allergenRepository.findByNumber(number).get();
    }
}
