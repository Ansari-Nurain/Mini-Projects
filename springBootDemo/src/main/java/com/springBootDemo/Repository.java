package com.springBootDemo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springBootDemo.entity.User;

public interface Repository extends JpaRepository<User, Integer> {
	
	public List<User> findByName(String name);
	
	
//	@Query("SELECT u FROM User u")
//	public List<User> getAllUsers();
	
	
	@Query(value = "SELECT * FROM user", nativeQuery = true)
	public List<User> getAllUsers();

	
	


}
