package com.testProject.reposetory;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.testProject.entites.Post;
import com.testProject.services.PostServices;

@Repository
public class PostReposetoryImpl implements PostRepositery {
	
	@Autowired
	RestTemplate restTemplate;

	

	@Override
	public List<Post> getAllPosts() {
		 Post[] PostList = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts", Post[].class).getBody();
			
			return Arrays.asList(PostList);
	}

	


}
