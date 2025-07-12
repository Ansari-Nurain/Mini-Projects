package com.spring_boot_security.controllers;

import java.util.List;

import com.spring_boot_security.models.User;
import com.spring_boot_security.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public List<User> getAllUsersd(){
		
		return this.userService.getAllUser();
	}
	
	@GetMapping("/{username}")
	public User getOneUser(@PathVariable String username) {
		
		return this.userService.getOneUser(username);
	}
	
	@PostMapping("/")
	public User addUsers(@RequestBody User user) {
		
		return this.addUsers(user);
	}

}
