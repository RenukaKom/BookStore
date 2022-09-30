package com.bridgelabz.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.bookstore.model.Users;
import com.bridgelabz.bookstore.service.UsersServiceImpl;
import com.bridgelabz.bookstore.utility.Response;

@RestController
@RequestMapping("/users")
public class UsersController {
	@Autowired
	private UsersServiceImpl usersService;
	
	@PostMapping
	public ResponseEntity<Response> addUser(@RequestBody Users users){
		Response response = usersService.addUser(users);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<Response> getAllUsers(){
		Response response = usersService.getAllUsers();
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<Response> updateUser(@RequestBody Users users, @PathVariable int userId) {
		Response response = usersService.updateUser(userId, users);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	@DeleteMapping("/{userId}")
	public ResponseEntity<Response> deleteUser(@PathVariable int userId) {
		Response response = usersService.deleteUser(userId);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
