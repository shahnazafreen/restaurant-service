package com.shahnazafreen.restaurantservice.repository;

import com.shahnazafreen.restaurantservice.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {

}
