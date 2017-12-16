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
    private Integer price;
    @Column
    @ManyToMany
    private List<Allergen> allergens;

    public Food(FoodType foodType, String name,Integer price, List<Allergen> allergens) {
        this.foodType = foodType;
        this.name = name;
        this.allergens = allergens;
        this.price = price;
    }

    public Food(){

    }
}
