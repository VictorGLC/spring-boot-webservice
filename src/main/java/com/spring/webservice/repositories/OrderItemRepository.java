package com.spring.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.webservice.entities.OrderItem;
import com.spring.webservice.entities.pk.OrderItemPK;

public interface OrderItemRepository  extends JpaRepository<OrderItem, OrderItemPK> {

}
