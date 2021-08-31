package com.shahnazafreen.restaurantservice.repository;

import com.shahnazafreen.restaurantservice.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

    public List<Item> findByItemName(String itemName);
    public List<Item> findByItemPrice(float itemPrice);

}