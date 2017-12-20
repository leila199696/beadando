package com.bead.netkaja.controller;

import com.bead.netkaja.annotation.Role;
import com.bead.netkaja.exception.UserException;
import com.bead.netkaja.model.Food;
import com.bead.netkaja.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.bead.netkaja.model.Customer.Role.ADMIN;
import static com.bead.netkaja.model.Customer.Role.CUSTOMER;

@RestController
@RequestMapping("netkaja/food")
public class FoodController {
  @Autowired
  private FoodService foodService;

  @GetMapping
  private ResponseEntity<List<Food>> allFood(){
    return ResponseEntity.ok(foodService.list());
  }

  @PostMapping("/create")
  private ResponseEntity<Food> create(@RequestBody Food food) throws UserException {
    Food food1 = foodService.create(food);
    return ResponseEntity.ok(food1);
  }

  @Role({ADMIN, CUSTOMER})
  @PutMapping("/update/{id}")
  private ResponseEntity<Food> update(@PathVariable long id, @RequestBody Food food) throws UserException {
    Food foodUpdate = foodService.update(food);
    return ResponseEntity.ok(foodUpdate);
  }

  @Role({ADMIN})
  @DeleteMapping("delete/{id}")
  private ResponseEntity<Food> deleteFood(@PathVariable Food food) throws UserException {
    return ResponseEntity.ok(foodService.delete(food));
  }
}
