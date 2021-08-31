package com.shahnazafreen.restaurantservice.service;

import com.shahnazafreen.restaurantservice.model.Customer;
import com.shahnazafreen.restaurantservice.model.Item;
import com.shahnazafreen.restaurantservice.model.OrderDetails;
import com.shahnazafreen.restaurantservice.model.dto.OrderSummary;
import com.shahnazafreen.restaurantservice.repository.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderDetailService {

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ItemService itemService;

    public OrderSummary createOrder(OrderDetails orderDetails) {
        orderDetailsRepository.save(orderDetails);

        OrderSummary orderSummary = new OrderSummary();
        int custId = orderDetails.getCustId();
        Customer customer = customerService.findCustomerById(custId);

        String name = customer.getFirstName() + " " + customer.getLastName();

        Map<Integer, Integer> itemMap = orderDetails.getItemMap();

        Map<Item, Integer> map = new HashMap<>();

        float orderTotal = 0;

        for (Map.Entry<Integer, Integer> entry : itemMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            Item item = itemService.findById(key);
            float itemPrice = item.getItemPrice();
            map.put(item, value);
            orderTotal = orderTotal + itemPrice * value;
        }
        orderSummary.setName(name);
        orderSummary.setOrderMap(map);
        orderSummary.setOrderTotal(orderTotal);

        return orderSummary;
    }

}
