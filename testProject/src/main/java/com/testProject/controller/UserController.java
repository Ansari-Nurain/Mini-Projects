package com.testProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testProject.entites.Post;
import com.testProject.services.PostServices;

@RestController
@RequestMapping("/post/api")
public class UserController {
	
	@Autowired
	private PostServices postServices;
	
	@GetMapping("/getPosts")
	public List<Post> getPosts() {
		
		List<Post> allDAta = postServices.getAllDAta();
		
		return allDAta;
	}
	
	@GetMapping("/countAll")
	public int countAll() {
		
		return postServices.getCount();
	}
	
	@GetMapping("/postTitle")
	public List<Post> listOfTitle(){
		
		return  postServices.getSortedTitle();
	}
	
	
	@GetMapping("/getPost/{id}")
	public List<Post> getPost(@PathVariable long id){
		
		return postServices.getPost(id);
	}
	
	

}
