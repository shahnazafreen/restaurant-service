package com.shahnazafreen.restaurantservice.service;

import com.shahnazafreen.restaurantservice.model.Customer;
import com.shahnazafreen.restaurantservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer deleteCustomerById(int id) {
        customerRepository.deleteById(id);
        return null;
    }

    public Customer findCustomerById(int id) {
        return customerRepository.findById(id).get();
    }


}
