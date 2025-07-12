package com.testProject.services;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testProject.entites.Post;
import com.testProject.reposetory.PostRepositery;

@Service
public class PostServiceImpl implements PostServices {
	 

	@Autowired
	PostRepositery postRepo;
	
	@Override
	public List<Post> getAllDAta() {
		
		List<Post> allPosts = postRepo.getAllPosts();

		return allPosts;
	}

	@Override
	public int getCount() {
		
		return this.getAllDAta().size();

	}

	@Override
	public List<Post> getSortedTitle() {
		
		
		return this.getAllDAta().stream().sorted(Comparator.comparing(Post::getTitle)).collect(Collectors.toList());
	}

	@Override
	public List<Post> getPost(long id) {

	
		
		return null;
	}

}
