package com.third_party_api.services;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.third_party_api.entites.Posts;
import com.third_party_api.exception.PostNotPresent;

@Service
public class PostsServiceImpl implements PostsService{

	@Autowired
	private RestTemplate template;
	
	@Override
	public List<Posts> getAllPosts() {

		Posts[] posts = template.getForObject("https://jsonplaceholder.typicode.com/posts", Posts[].class);
		
		return Arrays.asList(posts);
	}

	@Override
	public Posts getPost(long id) {

		Posts posts = template.getForObject("https://jsonplaceholder.typicode.com/posts/" +id , Posts.class);

		return posts;
	}
	
	@Override
	public Posts addPost(Posts posts) {

		String url = "https://jsonplaceholder.typicode.com/posts";
		Posts postForObject = template.postForObject(url, posts, Posts.class);
		
		return postForObject;
	}

	@Override
	public Posts update(long id, Posts posts) {

        String url = "https://jsonplaceholder.typicode.com/posts/" + id;
        template.put(url, posts);
		
		return posts;
	}

	@Override
	public String delete(long id) {

		String url = "https://jsonplaceholder.typicode.com/posts/"+id;
		template.delete(url);
		
		return "Post deleted";
	}

	@Override
	public int getCount() {

		int size = getAllPosts().size();
		
		return size;
	}

	@Override
	public List<Posts> getSortedTitle() {

		List<Posts> sorted = getAllPosts().stream()
				              .sorted(Comparator.comparing(Posts::getTitle))
				              .collect(Collectors.toList());
		
		return sorted;
	}

public Posts getUsingId(int id) throws PostNotPresent {
		
		Optional<Posts> findFirst = getAllPosts().stream().filter(p->p.getId()==id).findFirst();
	if(!findFirst.isPresent()) {
	
		System.out.println("Not found");
		throw new PostNotPresent("Post is not present");
	}
	return findFirst.get();
	
	}

@Override
public Posts byId(int id) {

	return getAllPosts().stream().filter(p->p.getId()==id).findFirst().orElseThrow();
	
}


}
