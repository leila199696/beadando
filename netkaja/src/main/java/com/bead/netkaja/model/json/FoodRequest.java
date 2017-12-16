package com.bead.netkaja.model.json;

import lombok.Data;

import java.util.List;

@Data
public class FoodRequest {
    private String username;
    private List<String> foodNameList;

    public String getUsername() {
        return username;
    }

    public List<String> getFoodNameList() {
        return foodNameList;
    }
}
