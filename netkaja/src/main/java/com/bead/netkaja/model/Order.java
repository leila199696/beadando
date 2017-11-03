package com.bead.netkaja.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Order extends Base{
    @Column
    private String name;
    @OneToOne
    private Customer customer;
    @Column
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Food> foodList;

    public Order(String name, Customer customer, List<Food> foodList) {
        this.name = name;
        this.customer = customer;
        this.foodList = foodList;
    }

    public Order(){

    }
}
