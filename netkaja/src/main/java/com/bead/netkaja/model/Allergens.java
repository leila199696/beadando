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
public class Allergens extends Base{
    @Column
    private String name;
    @Column
    @ManyToMany
    private List<Food> foodList;
    @Column
    private Integer number;

    public Allergens(String name, List<Food> foodList, Integer number) {
        this.name = name;
        this.foodList = foodList;
        this.number = number;
    }

    public Allergens(){

    }
}
