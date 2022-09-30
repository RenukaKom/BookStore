package com.bridgelabz.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.bookstore.model.Users;
import com.bridgelabz.bookstore.utility.Response;

@Repository
public interface IUserRepository  extends JpaRepository<Users, Integer>{

	
}
