package com.bead.netkaja.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "orders")
public class Order {
    private Long id;

    @ManyToOne
    private Customer customer;

    @OneToMany
    private List<Food> foodList;

    public Order(Customer customer, List<Food> foodList) {
        this.customer = customer;
        this.foodList = foodList;
    }

    public Order() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }
}
