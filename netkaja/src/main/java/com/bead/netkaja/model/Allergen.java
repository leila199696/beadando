package com.bead.netkaja.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "allergens")
public class Allergen {
    @JsonProperty(required = false)
    public Long id;

    @Column(unique = true)
    private String name;

    @Column(unique = true)
    private Integer number;

    public Allergen(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public Allergen() {

    }

    public String toString() {
        return name + " " + number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
