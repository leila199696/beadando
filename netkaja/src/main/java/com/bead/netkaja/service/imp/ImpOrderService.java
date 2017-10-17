package com.bead.netkaja.service.imp;

import com.bead.netkaja.model.Order;
import com.bead.netkaja.model.User;
import com.bead.netkaja.repository.OrderRepository;
import com.bead.netkaja.service.interf.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpOrderService implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> listOrderFromUser(User user) {
        return null;//TODO
    }

    @Override
    public Order create(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order delete(Order order) {
        orderRepository.delete(order);
        return order;
    }

    @Override
    public Order update(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> list() {
        return orderRepository.findAll();
    }
}
