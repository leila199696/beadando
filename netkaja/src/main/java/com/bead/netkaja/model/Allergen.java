package com.bead.netkaja.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Allergen extends Base{
    @Column(unique = true, nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private Integer number;

    public String toString(){
        return name + " " + number;
    }
}
