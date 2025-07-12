package com.third_party_api.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testProject.entites.Post;
import com.third_party_api.entites.Posts;
import com.third_party_api.exception.PostNotPresent;
import com.third_party_api.services.PostsService;

@RestController
@RequestMapping("/api")
public class PostsController {
	
	@Autowired
	private PostsService postsService;
	
	@GetMapping("/posts")
	public List<Posts> getAllPosts(){
		
		return postsService.getAllPosts();
	}
	
	@GetMapping("/posts/{id}")
	public Posts getPost(@PathVariable long id) {
		
		return postsService.getPost(id);
	}
	
	
	@PostMapping("/posts")
	public Posts addPost(@RequestBody Posts posts) {
		
		return postsService.addPost(posts);
	}
	
	@PutMapping("/posts/{id}")
	public Posts update(@PathVariable long id, @RequestBody Posts posts) {
		
		return postsService.update(id,posts);
	}
	
	@DeleteMapping("/posts/{id}")
	public String delete(@PathVariable long id) {
		
		return postsService.delete(id);
	}
	
	@GetMapping("/posts/count")
	public int countPosts() {
		
		return postsService.getCount();
	}
	
	@GetMapping("/posts/sort")
	public List<Posts> getSortedPosts(){
		
		return postsService.getSortedTitle();
	}
	
	@GetMapping("/byId")
	public Posts getUsingId(@RequestParam("id") int id) {
		Posts posts=null;
		
		try {
			 posts = postsService.getUsingId(id);
		} catch (PostNotPresent e) {

			e.printStackTrace();
		}
		return posts;
	}
	
	
	@GetMapping("/id")
	public Posts byId(@RequestParam("id") int id) {
		
		return postsService.byId(id);
	}
	

}
