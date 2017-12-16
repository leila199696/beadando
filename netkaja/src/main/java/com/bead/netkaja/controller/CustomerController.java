package com.bead.netkaja.controller;

import com.bead.netkaja.model.Customer;
import com.bead.netkaja.model.json.FoodRequest;
import com.bead.netkaja.model.json.GenericResponse;
import com.bead.netkaja.model.json.Login;
import com.bead.netkaja.service.interf.CustomerService;
import com.bead.netkaja.service.interf.FoodService;
import com.bead.netkaja.service.interf.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/rest/customer", consumes = "application/json")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private FoodService foodService;

    @Autowired
    private OrderService orderService;

    //POST ide: /rest/customer/login
    //Ilyen jsont vár: {"username": "név", "password": "jelszó"} (lásd: loginData)
    //angular true/false értéket kap vissza
    @PostMapping(value = "/login")
    @ResponseBody
    public ResponseEntity<GenericResponse> doLogin(@RequestBody Login loginData) {
        Customer customer = customerService.findByUsername(loginData.getUsername());
        if (customer == null) {
            System.out.println("Nincs ilyen felhasználó regisztrálva: " + loginData.getUsername());
            return new ResponseEntity<>(new GenericResponse(HttpStatus.UNAUTHORIZED), HttpStatus.UNAUTHORIZED); //HTTP 401
        }
        if (!loginData.getPassword().equals(customer.getPassword())) {
            System.out.println("Hibás jelszó (user: " + loginData.getUsername() + ")");
            return new ResponseEntity<>(new GenericResponse(HttpStatus.UNAUTHORIZED), HttpStatus.UNAUTHORIZED);
        }
        return ResponseEntity.ok(GenericResponse.ok()); //HTTP 200
    }

    //hasonló a loginhoz...
    @PostMapping(value = "/register")
    @ResponseBody
    public ResponseEntity<GenericResponse> doRegister(@RequestBody Customer customer) {
        try {
            customerService.register(new Customer(customer.getUsername(), customer.getPassword(), customer.getName(), customer.getAddress(), customer.getPhoneNumber(), customer.getEmail()));
            System.out.println("Regisztrálva: " + customerService.findByUsername(customer.getUsername()));
            return ResponseEntity.ok(GenericResponse.ok());
        } catch (Exception e) {
            System.out.println("Nem tudtam regisztrálni a felhasználót: " + customer.getUsername());
            e.printStackTrace();
            return new ResponseEntity<>(new GenericResponse(HttpStatus.INTERNAL_SERVER_ERROR), HttpStatus.INTERNAL_SERVER_ERROR); //HTTP 500
        }
    }

    //itt nem jsont küldünk, hanem pl. /rest/getDetails/sanyi
    @GetMapping(value = "/getDetails/{username}")
    @ResponseBody
    public ResponseEntity<Customer> getDetails(@PathVariable(value = "username") String userName) {
        Customer customer = customerService.findByUsername(userName);
        System.out.println(customer);
        return ResponseEntity.ok(customer);
    }

    @PutMapping(value = "/updateDetails")
    @ResponseBody
    public ResponseEntity<GenericResponse> updateDetails(@RequestBody Customer customer) {
        Customer customerToEdit = customerService.findByUsername(customer.getUsername());
        if (customerToEdit == null) {
            return new ResponseEntity<>(new GenericResponse(HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
        }
        try {
            customerToEdit.setPassword(customer.getPassword());
            customerToEdit.setName(customer.getName());
            customerToEdit.setAddress(customer.getAddress());
            customerToEdit.setPhoneNumber(customer.getPhoneNumber());
            customerToEdit.setEmail(customer.getEmail());
            customerToEdit = customerService.update(customerToEdit);
            System.out.println("Frissítve: " + customerToEdit.toString());
            return ResponseEntity.ok(GenericResponse.ok());
        } catch (Exception e) {
            System.out.println("Nem tudtam frissíteni: " + customer.getUsername());
            e.printStackTrace();
            return new ResponseEntity<>(new GenericResponse(HttpStatus.INTERNAL_SERVER_ERROR), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(value = "/addFoodToCart")
    @ResponseBody
    public ResponseEntity<GenericResponse> addFoodToCart(@RequestBody FoodRequest data) {
        Customer customer = customerService.findByUsername(data.getUsername());
        if (customer == null) {
            return new ResponseEntity<>(new GenericResponse(HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
        }
        try {
            for (String food : data.getFoodNameList()) {
                customer.addToCart(foodService.findByName(food));
            }
            customer = customerService.update(customer);
            System.out.println("Frissítve: " + customer);
            return ResponseEntity.ok(GenericResponse.ok());
        } catch (Exception e) {
            System.out.println("Nem tudtam frissíteni: " + data.getUsername());
            e.printStackTrace();
            return new ResponseEntity<>(new GenericResponse(HttpStatus.INTERNAL_SERVER_ERROR), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(value = "/removeFoodFromCart")
    @ResponseBody
    public ResponseEntity<GenericResponse> removeFoodFromCart(@RequestBody FoodRequest data) {
        Customer customer = customerService.findByUsername(data.getUsername());
        if (customer == null) {
            return new ResponseEntity<>(new GenericResponse(HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
        }
        try {
            for (String itemName : data.getFoodNameList()) {
                customer.removeFromCart(foodService.findByName(itemName));
            }
            customer = customerService.update(customer);
            System.out.println("Frissítve: " + customer);
            return ResponseEntity.ok(GenericResponse.ok());
        } catch (Exception e) {
            System.out.println("Nem tudtam frissíteni: " + data.getUsername());
            e.printStackTrace();
            return new ResponseEntity<>(new GenericResponse(HttpStatus.INTERNAL_SERVER_ERROR), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
