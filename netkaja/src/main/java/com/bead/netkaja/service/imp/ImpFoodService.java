package com.bead.netkaja.service.imp;

import com.bead.netkaja.model.Allergens;
import com.bead.netkaja.model.Food;
import com.bead.netkaja.repository.FoodRepository;
import com.bead.netkaja.service.interf.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpFoodService implements FoodService {
    @Autowired
    private FoodRepository foodRepository;

    @Override
    public List<Allergens> listAllergenicFood() {
        return foodRepository.listAllergens();
    }

    @Override
    public Food findByName(String name) {
        return foodRepository.findByName(name).get();
    }

    @Override
    public Food create(Food food) {
        return foodRepository.save(food);
    }

    @Override
    public Food delete(Food food) {
        foodRepository.delete(food);
        return food;
    }

    @Override
    public Food update(Food food) {
        return foodRepository.save(food);
    }

    @Override
    public List<Food> list() {
        return foodRepository.findAll();
    }
}
