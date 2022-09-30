package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.model.Users;
import com.bridgelabz.bookstore.utility.Response;

public interface IUserService {

	Response addUser(Users users);

	Response getAllUsers();

	Response updateUser(int userId, Users users);

	Response deleteUser(int userId);

}
