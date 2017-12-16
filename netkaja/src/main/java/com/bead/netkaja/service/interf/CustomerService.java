package com.bead.netkaja.service.interf;

import com.bead.netkaja.model.Food;
import com.bead.netkaja.model.Order;
import com.bead.netkaja.model.Customer;

import java.util.List;

public interface CustomerService extends CRUDService<Customer>{
    void register(Customer user);
    void login(String name, String password);
    void logout();
    void addFoodToCart(Food food);
    List<Food> listCart();
    Order createOrder();
    boolean isLoggedIn();
    Customer getLoggedInUser();

    Customer findByUsername(String username);
}
