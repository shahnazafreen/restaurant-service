package com.shahnazafreen.restaurantservice.model;

import javax.persistence.*;
import java.util.Map;

@Entity
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderId;
    private int custId;

    @ElementCollection(targetClass = Integer.class)
    @MapKeyClass(Integer.class)
    private Map<Integer, Integer> itemMap;

    public OrderDetails() {
    }

    public OrderDetails(int orderId, int custId, Map<Integer, Integer> itemMap) {
        this.orderId = orderId;
        this.custId = custId;
        this.itemMap = itemMap;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public Map<Integer, Integer> getItemMap() {
        return itemMap;
    }

    public void setItemMap(Map<Integer, Integer> itemMap) {
        this.itemMap = itemMap;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderId=" + orderId +
                ", custId=" + custId +
                ", itemMap=" + itemMap +
                '}';
    }
}
