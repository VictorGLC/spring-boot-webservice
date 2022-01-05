package com.spring.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.webservice.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long> {

}
