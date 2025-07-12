package com.testProject.services;

import java.util.List;

import com.testProject.entites.Post;

public interface PostServices {
	
 List<Post> getAllDAta();

  int getCount();

 List<Post> getSortedTitle();

List<Post> getPost(long id);


}
