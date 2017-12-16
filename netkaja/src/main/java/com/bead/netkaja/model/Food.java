package com.bead.netkaja.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "food")
public class Food {
    @JsonProperty(required = false)
    public Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private FoodType foodType;

    @Column(unique = true)
    private String name;

    @OneToMany
    private List<Allergen> allergens;

    public Food(FoodType foodType, String name, List<Allergen> allergens) {
        this.foodType = foodType;
        this.name = name;
        this.allergens = allergens;
    }

    public Food() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Allergen> getAllergens() {
        return allergens;
    }

    public void setAllergens(List<Allergen> allergens) {
        this.allergens = allergens;
    }
}
