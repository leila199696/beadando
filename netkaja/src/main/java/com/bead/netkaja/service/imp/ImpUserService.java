package com.bead.netkaja.service.imp;

import com.bead.netkaja.model.Food;
import com.bead.netkaja.model.Order;
import com.bead.netkaja.model.User;
import com.bead.netkaja.repository.UserRepository;
import com.bead.netkaja.service.interf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpUserService implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User delete(User user) {
        userRepository.delete(user);
        return user;
    }

    @Override
    public User update(User user)
    {
        return userRepository.save(user);
    }

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }

    @Override
    public void register(User user) {
        //TODO
    }

    @Override
    public void login(String name, String password) {
        //TODO
    }

    @Override
    public void logout(User user) {
        //TODO
    }

    @Override
    public void addFoodToCart(Food food) {
        //TODO
    }

    @Override
    public List<Food> listCart() {
        return null;//TODO
    }

    @Override
    public Order createOrder(Order order) {
        return null;//TODO
    }
}
