package com.bead.netkaja.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Food extends Base{
    @Column
    private FoodType foodType;
    @Column
    private String name;
    @Column
    @ManyToMany
    private List<Allergens> allergens;

    public Food(FoodType foodType, String name, List<Allergens> allergens) {
        this.foodType = foodType;
        this.name = name;
        this.allergens = allergens;
    }

    public Food(){

    }
}
