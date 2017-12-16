package com.bead.netkaja.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Customer extends Base{
    @Column(unique = true, nullable = false)
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role status;

    public enum Role {
        ADMIN,CUSTOMER;
    }

    private ArrayList<Food> cart;

    public void addToCart(Food food){
        cart.add(food);
    }

    public List<Food> getCart(){
        return cart;
    }

    public String getPassword(){
        return password;
    }

    public String getUserName(){
        return userName;
    }
}
