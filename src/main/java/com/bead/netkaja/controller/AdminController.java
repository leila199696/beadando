package com.bead.netkaja.controller;

import com.bead.netkaja.annotation.Role;
import com.bead.netkaja.exception.UserException;
import com.bead.netkaja.model.Customer;
import com.bead.netkaja.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.bead.netkaja.model.Customer.Role.ADMIN;

@RestController
@RequestMapping("/admin")
public class AdminController {
  @Autowired
  private CustomerService customerService;

  @Role({ADMIN})
  @PostMapping("/newadmin")
  public ResponseEntity<Customer> newadmin(@RequestBody Customer newUser) {
    Customer newAdmin = customerService.create(newUser);
    newAdmin.setStatus(ADMIN);
    return ResponseEntity.ok(newAdmin);
  }
}
