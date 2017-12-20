package com.bead.netkaja.controller;

import com.bead.netkaja.annotation.Role;
import com.bead.netkaja.exception.UserException;
import com.bead.netkaja.model.Customer;
import com.bead.netkaja.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.bead.netkaja.model.Customer.Role.ADMIN;
import static com.bead.netkaja.model.Customer.Role.CUSTOMER;

@RestController
@RequestMapping("netkaja/customer")
public class CustomerController {
  @Autowired
  private CustomerService customerService;

  @GetMapping
  private ResponseEntity<List<Customer>> allCustomers(){
    return ResponseEntity.ok(customerService.list());
  }

  @GetMapping("/loggedin")
  private ResponseEntity loggedIn(){
    if(customerService.getActualUser() == null){
      return ResponseEntity.ok(false);
    } else {
      return ResponseEntity.ok(customerService.getActualUser());
    }
  }

  @PostMapping("/login")
  private ResponseEntity<Customer> login(@RequestBody Customer customer)throws UserException {
    Customer loginUser = customerService.login(customer.getName(),customer.getPassword());
    return ResponseEntity.ok(loginUser);
  }

  @Role({ADMIN, CUSTOMER})
  @PostMapping("/logout")
  private ResponseEntity logout() throws UserException {
    customerService.logout();
    return ResponseEntity.ok(true);
  }

  @PostMapping("/register")
  private ResponseEntity<Customer> register(@RequestBody Customer customer) throws UserException {
    Customer newUser = customerService.register(customer);
    return ResponseEntity.ok(newUser);
  }

  @Role({ADMIN, CUSTOMER})
  @PutMapping("/update/{id}")
  private ResponseEntity<Customer> update(@PathVariable long id, @RequestBody Customer customer) throws UserException {
    Customer modifiedUser = customerService.update(customer);
    return ResponseEntity.ok(modifiedUser);
  }

  @Role({ADMIN, CUSTOMER})
  @GetMapping("/profile/{id}")
  private ResponseEntity<Customer> profile(@PathVariable long id) throws UserException {
    return ResponseEntity.ok(customerService.getUser(id+""));
  }

  @Role({ADMIN})
  @DeleteMapping("delete/{id}")
  private ResponseEntity<Customer> deleteUser(@PathVariable long id) throws UserException {
    return ResponseEntity.ok(customerService.delete(customerService.getUser(id+"")));
  }
}
