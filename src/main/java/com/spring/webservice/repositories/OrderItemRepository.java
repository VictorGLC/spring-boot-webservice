package com.spring.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.webservice.entities.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long> {

}
