package com.spring.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.webservice.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long> {

}
