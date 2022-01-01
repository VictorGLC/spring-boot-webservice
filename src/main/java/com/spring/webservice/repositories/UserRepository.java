package com.spring.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
