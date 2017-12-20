package com.bead.netkaja.service;

import com.bead.netkaja.model.Allergen;
import com.bead.netkaja.model.Food;
import com.bead.netkaja.repository.FoodRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
@Data
public class FoodService{
    @Autowired
    private FoodRepository foodRepository;

    public List<Allergen> listAllergenicFood() {
        return foodRepository.listAllergens();
    }

    public Food findByName(String name) {
        return foodRepository.findByName(name).get();
    }

    public Food create(Food food) {
        return foodRepository.save(food);
    }

    public Food delete(Food food) {
        foodRepository.delete(food);
        return food;
    }

    public Food update(Food food) {
        return foodRepository.save(food);
    }

    public List<Food> list() {
        return foodRepository.findAll();
    }
}
