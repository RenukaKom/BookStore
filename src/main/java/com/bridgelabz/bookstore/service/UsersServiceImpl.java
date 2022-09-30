package com.bridgelabz.bookstore.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.bookstore.model.Users;
import com.bridgelabz.bookstore.repository.IBookRepository;
import com.bridgelabz.bookstore.repository.IUserRepository;
import com.bridgelabz.bookstore.utility.Response;

@Service
public class UsersServiceImpl implements IUserService {

	@Autowired
	IUserRepository userRepository;
	
	@Autowired
	IBookRepository bookRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	public Response getAllUsers() {
		return new Response("All Users", 200, userRepository.findAll());
	}
	
	public Response addUser(Users users) {
		Users user = modelMapper.map(users, Users.class);
		userRepository.save(user);
		return new Response("new user added successfully", 200, user);
	}
	
	public Response updateUser(int userId, Users users) {
		Users user = modelMapper.map(users, Users.class);
		userRepository.save(user);
		return new Response("updated user successfully", 200, user);
	}
	
	public Response deleteUser(int userId) {
		userRepository.deleteById(userId);
		return new Response();
	
	}

}
