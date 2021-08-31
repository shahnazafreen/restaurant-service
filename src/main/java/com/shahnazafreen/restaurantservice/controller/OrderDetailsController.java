package com.shahnazafreen.restaurantservice.controller;

import com.shahnazafreen.restaurantservice.model.OrderDetails;
import com.shahnazafreen.restaurantservice.model.dto.OrderSummary;
import com.shahnazafreen.restaurantservice.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderDetailsController {

    @Autowired
    private OrderDetailService orderDetailService;

    @PostMapping(path = "createOrder")
    public OrderSummary createOrder(@RequestBody OrderDetails orderdetails) {
         return orderDetailService.createOrder(orderdetails);
    }
}
