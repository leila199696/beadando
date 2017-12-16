package com.bead.netkaja.controller;

import com.bead.netkaja.service.imp.ImpCustomerService;
import com.bead.netkaja.service.imp.ImpOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.bead.netkaja.model.Role.ADMIN;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private ImpCustomerService customerService;
    @Autowired
    private ImpOrderService orderService;

    @Role({ADMIN})
    @GetMapping("/allCustomer")
    public ResponseEntity listReports(){
        return ResponseEntity.ok(customerService.list());
    }

    @Role({ADMIN})
    @GetMapping("/allOrders")
    public ResponseEntity listReports(){
        return ResponseEntity.ok(orderService.list());
    }

    @Role({ADMIN})
    @GetMapping("/allergens")
    public ResponseEntity listReports(){
        return ResponseEntity.ok(reportService.listReports());
    }

    @Role({ADMIN})
    @GetMapping("/allFood")
    public ResponseEntity listReports(){
        return ResponseEntity.ok(reportService.listReports());
    }

    @Role({ADMIN})
    @PostMapping("/newadmin")
    public ResponseEntity<User> newadmin(@RequestBody User newUser) {
        try{
            User newAdmin = userService.registrer(newUser, ADMIN);
            return ResponseEntity.ok(newAdmin);
        } catch (UserException ex) {
            return ResponseEntity.badRequest().build();
        }
    }
}
