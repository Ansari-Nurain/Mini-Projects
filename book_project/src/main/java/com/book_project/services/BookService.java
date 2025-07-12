package com.book_project.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.book_project.entites.Book;

@Component
public class BookService {
	
	private static List<Book> list = new ArrayList<>();
	
	static {
		
		list.add(new Book(1,"Java","eee"));
		list.add(new Book(2,"Python","qqqq"));
		list.add(new Book(3,"Java Script","wwww"));
	}
	
	public List<Book> getAllBooks(){
		
		return list;
	}
	
	public Book getById(int id){
		Book book = null;
//	 book = list.stream().filter(e->e.getId()==id).findFirst().get();
		
		for (Book e : list) {
		    if (e.getId() == id) {
		        book = e;                // Assign the found book to the variable
		        break;                  // Exit the loop once the book is found
		    }
		}
		return book;
		
	}
	
	public Book addBOOK(Book b) {
		 list.add(b);
		return b;
	}

	public void deleteBook(int bid) {

//		 list = list.stream().filter(book ->{
//			if(book.getId()!=bid) {
//				return true;
//			}else {
//				return false;
//			}
//		}).collect(Collectors.toList());
		
		list = list.stream().filter(book->book.getId()!=bid).collect(Collectors.toList());
	}

	public void updateBook(Book book,int bookid) {

		list=list.stream().map(b->{
			if(b.getId()==bookid) 
			{
				b.setTitle(book.getTitle());
				b.setAuthour(book.getAuthour());
			}
			return b;
		}).collect(Collectors.toList());
	}

}
