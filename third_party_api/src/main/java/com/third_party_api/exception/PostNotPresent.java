package com.third_party_api.exception;

public class PostNotPresent extends Exception {
	
	String message;

	public PostNotPresent(String message) {
		super(message);
	}
	

}
