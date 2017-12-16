package com.bead.netkaja.service.imp;

import com.bead.netkaja.model.Allergen;
import com.bead.netkaja.repository.AllergensRepository;
import com.bead.netkaja.service.interf.AllergensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ImpAllergensService implements AllergensService {
    @Autowired
    private AllergensRepository allergensRepository;

    @Override
    public Allergen create(Allergen allergen) {
        return allergensRepository.save(allergen);
    }

    @Override
    public Allergen delete(Allergen allergen) {
        allergensRepository.delete(allergen);
        return allergen;
    }

    @Override
    public Allergen update(Allergen allergen) {
        return allergensRepository.save(allergen);
    }

    @Override
    public List<Allergen> list() {
        return allergensRepository.findAll();
    }

    @Override
    public Allergen findByName(String name) {
        try{
            return allergensRepository.findByName(name).get();
        }catch (NoSuchElementException e){
            System.out.println("Nincs ilyen elem");
        }
        return null;
    }

    @Override
    public Allergen findByNumber(Integer number) {
        return allergensRepository.findByNumber(number).get();
    }
}
