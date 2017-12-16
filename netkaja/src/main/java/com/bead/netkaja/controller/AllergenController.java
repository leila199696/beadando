package com.bead.netkaja.controller;

import com.bead.netkaja.model.Allergen;
import com.bead.netkaja.model.json.GenericResponse;
import com.bead.netkaja.service.interf.AllergenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//hasonló a FoodControllerhez...
@RestController
@RequestMapping(value = "/rest/allergen")
public class AllergenController {
    @Autowired
    private AllergenService allergenService;

    @GetMapping(value = "/list")
    @ResponseBody
    public ResponseEntity<List<Allergen>> listAllergen() {
        List<Allergen> allergenList = allergenService.list();
        System.out.println(allergenList);
        return ResponseEntity.ok(allergenList);
    }

    @PostMapping(value = "/add")
    @ResponseBody
    public ResponseEntity<GenericResponse> addAllergen(@RequestBody Allergen allergen) {
        allergenService.create(allergen);
        return ResponseEntity.ok(GenericResponse.ok());
    }

    @DeleteMapping(value = "/remove")
    @ResponseBody
    public ResponseEntity<GenericResponse> removeAllergen(@RequestBody Allergen allergen) {
        allergenService.delete(allergen);
        return ResponseEntity.ok(GenericResponse.ok());
    }

    @PutMapping(value = "/modify")
    @ResponseBody
    public ResponseEntity<GenericResponse> modifyAllergen(@RequestBody Allergen allergen) {
        Allergen allergenToModify = allergenService.findByNumber(allergen.getNumber());
        allergenToModify.setName(allergen.getName());
        allergenService.update(allergenToModify);
        return ResponseEntity.ok(GenericResponse.ok());
    }
}
