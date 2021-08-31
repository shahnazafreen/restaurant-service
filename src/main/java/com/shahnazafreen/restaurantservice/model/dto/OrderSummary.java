package com.shahnazafreen.restaurantservice.model.dto;

import com.shahnazafreen.restaurantservice.model.Item;

import java.util.Map;

public class OrderSummary {

    private String name;
    private Map<Item, Integer> orderMap;
    private float orderTotal;

    public OrderSummary() {
    }

    public OrderSummary(String name, Map<Item, Integer> orderMap, float orderTotal) {
        this.name = name;
        this.orderMap = orderMap;
        this.orderTotal = orderTotal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Item, Integer> getOrderMap() {
        return orderMap;
    }

    public void setOrderMap(Map<Item, Integer> orderMap) {
        this.orderMap = orderMap;
    }

    public float getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(float orderTotal) {
        this.orderTotal = orderTotal;
    }

    @Override
    public String toString() {
        return "OrderSummary{" +
                "name='" + name + '\'' +
                ", orderMap=" + orderMap +
                ", orderTotal=" + orderTotal +
                '}';
    }
}
