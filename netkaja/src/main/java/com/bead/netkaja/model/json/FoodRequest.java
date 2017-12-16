package com.bead.netkaja.controller.json;

import lombok.Data;

import java.util.List;

@Data
public class AddFood {
    private String username;
    private List<String> food;

    public String getUsername() {
        return username;
    }

    public List<String> getFood() {
        return food;
    }
}
