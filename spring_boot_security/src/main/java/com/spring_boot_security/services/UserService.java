package com.spring_boot_security.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring_boot_security.models.User;

@Service
public class UserService {
	
	ArrayList<User> list = new ArrayList<>();

	public UserService() {
		
		list.add(new User("nurain","abc","nn@gmail.com"));
		list.add(new User("ansari","xyz","aa@gmail.com"));

	}
	
	public List<User> getAllUser() {
		
		return this.list;
	}
	
	public User getOneUser(String username) {
		
		User getUser = list.stream().filter((user)-> user.getUsername().equals(username)).findAny().orElse(null);
		
		return getUser;
	}
	
	public User addUsers(User user) {
		
		this.list.add(user);
		
		return user; 
	}

}
