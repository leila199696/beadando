package com.bead.netkaja.controller;

import com.bead.netkaja.model.Food;
import com.bead.netkaja.model.json.GenericResponse;
import com.bead.netkaja.service.interf.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/food")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @GetMapping(value = "/list")
    @ResponseBody
    public ResponseEntity<List<Food>> listFood() {
        List<Food> foodList = foodService.list();
        System.out.println(foodList);
        return ResponseEntity.ok(foodList);
    }

    @PostMapping(value = "/add")
    @ResponseBody
    public ResponseEntity<GenericResponse> addFood(@RequestBody Food food) {
        foodService.create(food);
        return ResponseEntity.ok(GenericResponse.ok());
    }

    //id szerint is törölhetünk akár (pl. PathParamként átadjuk az id-t, lásd CustomerController)
    @DeleteMapping(value = "/remove")
    @ResponseBody
    public ResponseEntity<GenericResponse> removeFood(@RequestBody Food food) {
        foodService.delete(food);
        return ResponseEntity.ok(GenericResponse.ok());
    }

    @PutMapping(value = "/modify")
    @ResponseBody
    public ResponseEntity<GenericResponse> modifyFood(@RequestBody Food food) {
        Food foodToModify = foodService.findByName(food.getName()); //ehelyett lehet findOne(Long id) alapján is --> ezt implementálni kell, ha szükséges (FoodRepository --> FoodService --> ImpFoodService) >>> ekkor változtathatunk nevet is akár. vagy az egyszerűség kedvéért doksiba leírod, hogy nem lehet módosítani. :D
        foodToModify.setAllergens(food.getAllergens());
        foodToModify.setFoodType(food.getFoodType());
        foodService.update(foodToModify);
        return ResponseEntity.ok(GenericResponse.ok());
    }
}
