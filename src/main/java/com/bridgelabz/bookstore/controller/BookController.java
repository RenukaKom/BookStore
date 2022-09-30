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

import com.bridgelabz.bookstore.model.Books;
import com.bridgelabz.bookstore.service.BookStoreImpl;
import com.bridgelabz.bookstore.utility.Response;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	private BookStoreImpl bookService;
	
	@PostMapping
	public ResponseEntity<Response> addBook(@RequestBody Books books){
		Response response = bookService.addBook(books);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
	

	@GetMapping
	public ResponseEntity<Response> getAllBooks(){
		Response response = bookService.getAllBooks();
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	@PutMapping("/{bookId}")
	public ResponseEntity<Response> updateBook(@RequestBody Books books, @PathVariable int bookId) {
		Response response = bookService.updateBook(bookId, books);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@DeleteMapping("/{bookId}")
	public ResponseEntity<Response> deleteBook(@PathVariable int bookId) {
		Response response = bookService.deleteBook(bookId);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}	

}
