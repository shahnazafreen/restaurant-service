package com.shahnazafreen.restaurantservice.model;

import javax.persistence.Convert;
import java.time.LocalDate;
import java.util.HashMap;

public class Order {

    private int orderId;
    private int customerId;

    @Convert(converter = HashMap.class)
    private String itemObject;

    private LocalDate localDate;

    public Order() {
    }
}
