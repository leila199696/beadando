package com.bead.netkaja.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Allergens{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long ID;
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
