package com.bead.netkaja.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

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
    private Integer number;

    public Allergens(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public Allergens(){

    }

    public String toString(){
        return name + " " + number;
    }
}
