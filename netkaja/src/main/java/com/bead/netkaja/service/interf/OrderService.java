package com.bead.netkaja.service.interf;

import com.bead.netkaja.model.Order;
import com.bead.netkaja.model.Customer;

import java.util.List;

public interface OrderService extends CRUDService<Order>{
    List<Order> listOrderFromUser(Customer user);
}
