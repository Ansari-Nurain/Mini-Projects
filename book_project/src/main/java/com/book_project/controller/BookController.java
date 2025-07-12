package com.book_project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book_project.entites.Book;
import com.book_project.services.BookService;

@RestController
public class BookController {
	
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/book")
	public ResponseEntity<List<Book>> getBook() {
		List<Book> allBooks = bookService.getAllBooks();
		if(allBooks.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(allBooks));
	}
	
	
	@GetMapping("/book/{id}")
	public ResponseEntity<Book> getById(@PathVariable("id") int id) {
		Book byId = bookService.getById(id);
		
		if(byId==null) {
			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(byId));
	}
	
	@PostMapping("/book")
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		Book book2 = null;

		try {
			
			Book b = bookService.addBOOK(book);
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();

		} catch (Exception e) {

			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
	}
	
	@DeleteMapping("/book/{bookid}")
	public ResponseEntity<Void> deleteBook(@PathVariable("bookid") int bookid) {

		try {
			
			bookService.deleteBook(bookid);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

		} catch (Exception e) {

			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@PutMapping("/book/{bookid}")
	public Book updateBook(@RequestBody Book book,@PathVariable("bookid") int bookid) {
		
		bookService.updateBook(book,bookid);
		
		return book;
		
	}

}
