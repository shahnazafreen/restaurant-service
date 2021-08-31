package com.shahnazafreen.restaurantservice.controller;

import com.shahnazafreen.restaurantservice.model.Item;
import com.shahnazafreen.restaurantservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping(path = "items/createItem", consumes = "application/json", produces = "application/json")
    public Item createNewItem(@RequestBody Item item) {
        return itemService.createItem(item);
    }

    @DeleteMapping(path = "items/deleteItemById")
    public void deleteItemById(@PathParam("id") int id) {
        itemService.deleteItem(id);
    }

    @GetMapping(path = "items/getMenu")
    public Object getMenu() {
        return itemService.findAllItems();
    }

    @GetMapping(path = "items/getById")
    public Item findById(@PathParam("id") int id) {
        return itemService.findById(id);
    }

    @GetMapping(path = "items/getByName")
    public List<Item> findItemByName(@PathParam("name") String name) {
        return itemService.findItemByName(name);
    }

    @GetMapping(path = "items/getByPrice")
    public List<Item> findItemByPrice(@PathParam("price") float price) {
        return itemService.findItemByPrice(price);
    }
}
