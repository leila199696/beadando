package com.bead.netkaja.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Order{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long ID;
    @OneToOne
    private Customer customer;
    @Column
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Food> foodList;

    public Order(Customer customer, List<Food> foodList) {
        this.customer = customer;
        this.foodList = foodList;
    }

    public Order(){

    }
}
