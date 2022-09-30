package com.bridgelabz.bookstore.service;

import org.springframework.http.ResponseEntity;

import com.bridgelabz.bookstore.model.Books;
import com.bridgelabz.bookstore.utility.Response;

public interface IBookService {
	
	Response addBook(Books books);
	
	Response getAllBooks();
	
	Response updateBook(int bookId, Books books);
	
	Response deleteBook(int bookId);

	
}
