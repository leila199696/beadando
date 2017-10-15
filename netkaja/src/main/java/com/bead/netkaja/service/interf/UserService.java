package com.bead.netkaja.service.interf;

import com.bead.netkaja.model.Food;
import com.bead.netkaja.model.Order;
import com.bead.netkaja.model.User;

import java.util.List;

public interface UserService extends CRUDService<User>{
    void register(User user);
    void login(String name, String password);
    void logout(User user);
    void addFoodToCart(Food food);
    List<Food> listCart();
    Order createOrder(Order order);
}
