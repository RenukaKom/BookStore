package com.bridgelabz.bookstore.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.bookstore.model.Books;
import com.bridgelabz.bookstore.repository.IBookRepository;
import com.bridgelabz.bookstore.utility.Response;


@Service
public class BookStoreImpl implements IBookService {
	@Autowired
	private IBookRepository booksRepository;
	
	@Autowired
	private ModelMapper modelMapper;
		
	public Response addBook(Books books) {
		Books book = modelMapper.map(books, Books.class);
		booksRepository.save(book);
		return new Response("new book added successfully", 200, book);
	}

	public Response getAllBooks() {
		return new Response("All books", 200, booksRepository.findAll());
	}
	
	public Response updateBook(int bookId, Books books) {
		Books book = modelMapper.map(books, Books.class);
		booksRepository.save(books);
		return new Response("updated book successfully", 200, book);
	}
	
	public Response deleteBook(int bookId) {
		booksRepository.deleteById(bookId);
		return new Response();
	
	}


}
