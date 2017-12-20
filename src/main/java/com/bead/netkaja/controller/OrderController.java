package com.bead.netkaja.controller;

import com.bead.netkaja.annotation.Role;
import com.bead.netkaja.exception.UserException;
import com.bead.netkaja.model.Food;
import com.bead.netkaja.model.Order;
import com.bead.netkaja.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.bead.netkaja.model.Customer.Role.ADMIN;
import static com.bead.netkaja.model.Customer.Role.CUSTOMER;

@RequestMapping("netkaja/order")
public class OrderController {
  @Autowired
  private OrderService orderService;

  @GetMapping
  private ResponseEntity<List<Order>> allOrder(){
    return ResponseEntity.ok(orderService.list());
  }

  @PostMapping("/create")
  private ResponseEntity<Order> create(@RequestBody Order order) throws UserException {
    Order order1 = orderService.create(order);
    return ResponseEntity.ok(order1);
  }

  @Role({ADMIN, CUSTOMER})
  @PutMapping("/update/{id}")
  private ResponseEntity<Order> update(@PathVariable long id, @RequestBody Order order) throws UserException {
    Order order1 = orderService.update(order);
    return ResponseEntity.ok(order1);
  }

  @Role({ADMIN})
  @DeleteMapping("delete/{id}")
  private ResponseEntity<Order> deleteFood(@PathVariable Order order) throws UserException {
    return ResponseEntity.ok(orderService.delete(order));
  }
}
