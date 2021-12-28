package com.spring.webservice.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.webservice.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> getUsers() {
		User u = new User(1L, "Mark", "mark@gmail.com", "9999999", "password");
		return ResponseEntity.ok().body(u);
	}
	
}
