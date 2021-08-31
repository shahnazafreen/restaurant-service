package com.shahnazafreen.restaurantservice.service;

import com.shahnazafreen.restaurantservice.model.Item;
import com.shahnazafreen.restaurantservice.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    public void deleteItem(int id) {
        itemRepository.deleteById(id);
    }

    public List<Item> findAllItems() {
        return itemRepository.findAll();
    }

    public Item findById(int id) {
        return itemRepository.findById(id).get();
    }

    public List<Item> findItemByName(String itemName) {
        return itemRepository.findByItemName(itemName);
    }

    public List<Item> findItemByPrice(float price) {
        return itemRepository.findByItemPrice(price);
    }
}
