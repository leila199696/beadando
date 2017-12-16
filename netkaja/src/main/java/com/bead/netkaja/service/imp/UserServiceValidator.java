package com.bead.netkaja.service.imp;

import com.bead.netkaja.model.Customer;

public class UserServiceValidator {
    void isValid(Customer user) throws IllegalArgumentException{
        if(!user.getUsername().matches("[A-Za-z]+")){
            throw new IllegalArgumentException("Betüket kell tartalmaznia a névnek!");
        } else if(user.getPassword().length() < 6){
            throw new IllegalArgumentException("Legalább 6 karakter a jelszó!");
        }
    }
}
