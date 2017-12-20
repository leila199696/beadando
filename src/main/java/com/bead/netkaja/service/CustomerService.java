package com.bead.netkaja.service;

import com.bead.netkaja.model.Customer;
import com.bead.netkaja.model.Food;
import com.bead.netkaja.model.Order;
import com.bead.netkaja.repository.CustomerRepository;
import com.bead.netkaja.repository.OrderRepository;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
@Data
@EqualsAndHashCode(callSuper = false)
public class CustomerService extends CustomerServiceValidator{
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private OrderRepository orderRepository;

    private Customer actualUser;

    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer delete(Customer customer) {
        customerRepository.delete(customer);
        return customer;
    }

    public Customer update(Customer customer)
    {
        return customerRepository.save(customer);
    }

    public List<Customer> list() {
        return customerRepository.findAll();
    }

    public Customer register(Customer customer) throws IllegalArgumentException{
        isValid(customer);
        actualUser = customerRepository.save(customer);
        return actualUser;
    }

    public Customer login(String name, String password) {
        actualUser = customerRepository.findByUserNameAndPassword(name, password).get();
        return actualUser;
    }

    public void logout() {
        actualUser = null;
    }

    public void addFoodToCart(Food food) {
        actualUser.addToCart(food);
    }

    public List<Food> listCart() {
        return actualUser.getCart();
    }

    public Order createOrder() {
        Order order = new Order(actualUser,actualUser.getCart());
        return orderRepository.save(order);
    }

    public boolean isLoggedIn() {
        return actualUser != null;
    }

    public Customer getLoggedInUser() {
        return actualUser;
    }

    public Customer getUser(String id) {
      return customerRepository.findById(id).get();
    }
}
