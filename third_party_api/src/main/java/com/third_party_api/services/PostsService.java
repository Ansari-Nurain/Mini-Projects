package com.third_party_api.services;

import java.util.List;

import com.third_party_api.entites.Posts;
import com.third_party_api.exception.PostNotPresent;

public interface PostsService {
	
	public List<Posts> getAllPosts();

	public Posts getPost(long id);
	
	public Posts addPost(Posts posts);
	
	public Posts update(long id, Posts posts);

	public String delete(long id);

	public int getCount();

	public List<Posts> getSortedTitle();
	public Posts getUsingId(int id) throws PostNotPresent;

	public Posts byId(int id);


}
