package com.bead.netkaja.controller;

import com.bead.netkaja.annotation.Role;
import com.bead.netkaja.exception.UserException;
import com.bead.netkaja.model.Allergen;
import com.bead.netkaja.model.Food;
import com.bead.netkaja.service.AllergenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.bead.netkaja.model.Customer.Role.ADMIN;
import static com.bead.netkaja.model.Customer.Role.CUSTOMER;

@RestController
@RequestMapping("netkaja/allergen")
public class AllergenController {
  @Autowired
  private AllergenService allergenService;

  @GetMapping
  private ResponseEntity<List<Allergen>> allAllergen(){
    return ResponseEntity.ok(allergenService.list());
  }

  @PostMapping("/create")
  private ResponseEntity<Allergen> create(@RequestBody Allergen allergen) throws UserException {
    Allergen allergen1 = allergenService.create(allergen);
    return ResponseEntity.ok(allergen1);
  }

  @Role({ADMIN, CUSTOMER})
  @PutMapping("/update/{id}")
  private ResponseEntity<Allergen> update(@PathVariable long id, @RequestBody Allergen allergen) throws UserException {
    Allergen allergen1 = allergenService.update(allergen);
    return ResponseEntity.ok(allergen1);
  }

  @Role({ADMIN})
  @DeleteMapping("delete/{id}")
  private ResponseEntity<Allergen> deleteFood(@PathVariable Allergen allergen) throws UserException {
    return ResponseEntity.ok(allergenService.delete(allergen));
  }
}
