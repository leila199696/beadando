package com.bead.netkaja.service.imp;

import com.bead.netkaja.model.Customer;
import com.bead.netkaja.model.Food;
import com.bead.netkaja.model.Order;
import com.bead.netkaja.repository.CustomerRepository;
import com.bead.netkaja.repository.OrderRepository;
import com.bead.netkaja.service.interf.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpCustomerService extends UserServiceValidator implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private OrderRepository orderRepository;

    private Customer actualUser;

    @Override
    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer delete(Customer customer) {
        customerRepository.delete(customer);
        return customer;
    }

    @Override
    public Customer update(Customer customer)
    {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> list() {
        return customerRepository.findAll();
    }

    @Override
    public void register(Customer customer) throws IllegalArgumentException{
        isValid(customer);
        actualUser = customerRepository.save(customer);
    }

    @Override
    public void login(String name, String password) {
        actualUser = customerRepository.findByUserNameAndPassword(name, password).get();
    }

    @Override
    public void logout() {
        actualUser = null;
    }

    @Override
    public void addFoodToCart(Food food) {
        actualUser.addToCart(food);
    }

    @Override
    public List<Food> listCart() {
        return actualUser.getCart();
    }

    @Override
    public Order createOrder() {
        Order order = new Order(actualUser,actualUser.getCart());
        return orderRepository.save(order);
    }

    @Override
    public boolean isLoggedIn() {
        return actualUser != null;
    }

    @Override
    public Customer getLoggedInUser() {
        return actualUser;
    }
}
