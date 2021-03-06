package com.bead.netkaja.service;

import com.bead.netkaja.model.Customer;

public class CustomerServiceValidator {
    void isValid(Customer user) throws IllegalArgumentException{
        if(!user.getUserName().matches("[A-Za-z ]")){
            throw new IllegalArgumentException("Betüket kell tartalmaznia a névnek!");
        } else if(user.getPassword().length() < 6){
            throw new IllegalArgumentException("Legalább 6 karakter a jelszó!");
        }
    }
}
