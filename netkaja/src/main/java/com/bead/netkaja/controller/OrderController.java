package com.bead.netkaja.controller;

import com.bead.netkaja.model.Customer;
import com.bead.netkaja.model.Order;
import com.bead.netkaja.model.json.GenericResponse;
import com.bead.netkaja.service.interf.CustomerService;
import com.bead.netkaja.service.interf.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/list")
    @ResponseBody
    public ResponseEntity<List<Order>> listAllOrders(){
        List<Order> orderList = orderService.list();
        System.out.println(orderList);
        return ResponseEntity.ok(orderList);
    }

    @GetMapping(value = "/listByCustomer/{username}")
    @ResponseBody
    public ResponseEntity<List<Order>> listByCustomer(@PathVariable String username){
        List<Order> orderList = orderService.listOrderFromUser(customerService.findByUsername(username));
        System.out.println(orderList);
        return ResponseEntity.ok(orderList);
    }

    @PostMapping(value = "/finalizeOrder/{username}")
    @ResponseBody
    public ResponseEntity<GenericResponse> order(@PathVariable(value = "username") String username) {
        Customer customer = customerService.findByUsername(username);
        if (customer == null) {
            return new ResponseEntity<>(new GenericResponse(HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
        }
        try {
            Order order = customerService.createOrder();
            customer.addOrder(order);
            customer.getCart().clear();
            customer = customerService.update(customer);
            System.out.println("Rendelés leadva: " + customer.toString() + " --> " + order.toString());
            return ResponseEntity.ok(GenericResponse.ok());
        } catch (Exception e) {
            System.out.println("Nem tudott rendelni: " + username);
            e.printStackTrace();
            return new ResponseEntity<>(new GenericResponse(HttpStatus.INTERNAL_SERVER_ERROR), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //megrendelést nem törlünk az egyszerűség kedvéért. ;)
}
