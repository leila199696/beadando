package com.bead.netkaja.service;

import com.bead.netkaja.model.Order;
import com.bead.netkaja.model.Customer;
import com.bead.netkaja.repository.OrderRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
@Data
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> listOrderFromUser(Customer user) {
        return orderRepository.findByCustomer(user);
    }

    public Order create(Order order) {
        return orderRepository.save(order);
    }

    public Order delete(Order order) {
        orderRepository.delete(order);
        return order;
    }

    public Order update(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> list() {
        return orderRepository.findAll();
    }
}
