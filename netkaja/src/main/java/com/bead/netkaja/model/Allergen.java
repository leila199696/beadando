package com.bead.netkaja.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Allergen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long ID;
    @Column
    private String name;
    @Column
    private Integer number;

    public Allergen(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public Allergen(){

    }

    public String toString(){
        return name + " " + number;
    }
}
