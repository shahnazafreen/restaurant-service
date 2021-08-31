package com.shahnazafreen.restaurantservice.controller;

import com.shahnazafreen.restaurantservice.model.Customer;
import com.shahnazafreen.restaurantservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping(path = "customer")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @DeleteMapping(path = "deleteCustomer")
    public void deleteCustomerById(@PathParam("id") int id) {
        customerService.deleteCustomerById(id);
    }

    @GetMapping(path = "getCustomer")
    public void findCustomerById(int id) {
        customerService.findCustomerById(id);
    }
}
