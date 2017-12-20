package com.bead.netkaja.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Food extends Base{
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private FoodType foodType;

    public enum FoodType {
        APPERTIZER,MAINCOURSE,DESSERT;
    }

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer price;

    @ManyToMany
    private List<Allergen> allergens;
}
