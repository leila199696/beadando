package com.bead.netkaja.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Customer extends Base{
    @Column
    private String userName;
    @Column
    private String password;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String phoneNumber;
    @Column
    private String email;
    @Column
    private Role status;
    @Column
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Food> cart;

    public Customer(String userName, String password, String name, String address, String phoneNumber, String email) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.status = Role.CUSTOMER;
        cart = new ArrayList<>();
    }

    public Customer(){

    }

    public void addToCart(Food food){
        cart.add(food);
    }
}
