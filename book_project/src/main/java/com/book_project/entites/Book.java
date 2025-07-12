package com.book_project.entites;

public class Book {
	
	public int id;
	public String title;
	public String authour;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String title, String authour) {
		super();
		this.id = id;
		this.title = title;
		this.authour = authour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthour() {
		return authour;
	}

	public void setAuthour(String authour) {
		this.authour = authour;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", authour=" + authour + "]";
	}
	
	

}
