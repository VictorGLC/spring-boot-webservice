package com.spring.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.webservice.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long> {

}
