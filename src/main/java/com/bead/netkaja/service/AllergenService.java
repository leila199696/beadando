package com.bead.netkaja.service;

import com.bead.netkaja.model.Allergen;
import com.bead.netkaja.repository.AllergenRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@SessionScope
@Data
public class AllergenService{
    @Autowired
    private AllergenRepository allergensRepository;

    public Allergen create(Allergen allergen) {
        return allergensRepository.save(allergen);
    }

    public Allergen delete(Allergen allergen) {
        allergensRepository.delete(allergen);
        return allergen;
    }

    public Allergen update(Allergen allergen) {
        return allergensRepository.save(allergen);
    }

    public List<Allergen> list() {
        return allergensRepository.findAll();
    }

    public Allergen findByName(String name) {
        try{
            return allergensRepository.findByName(name).get();
        }catch (NoSuchElementException e){
            System.out.println("Nincs ilyen elem");
        }
        return null;
    }

    public Allergen findByNumber(Integer number) {
        return allergensRepository.findByNumber(number).get();
    }
}
