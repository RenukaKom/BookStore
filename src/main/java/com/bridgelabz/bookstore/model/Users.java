package com.bridgelabz.bookstore.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.bridgelabz.bookstore.model.Books;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String password;
	@OneToMany
	private List<Books> cartBook = new LinkedList<>();
	
	
}