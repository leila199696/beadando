package com.bead.netkaja.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long ID;
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
