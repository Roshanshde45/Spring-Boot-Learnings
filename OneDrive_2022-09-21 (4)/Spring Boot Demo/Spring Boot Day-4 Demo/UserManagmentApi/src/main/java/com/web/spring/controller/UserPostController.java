package com.web.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.spring.bean.Post;
import com.web.spring.bean.User;
import com.web.spring.reposistory.PostRepo;
import com.web.spring.reposistory.UserRepo;

@RestController
@RequestMapping("post")
public class UserPostController {
	@Autowired
	private UserRepo urepo;
	@Autowired
	private PostRepo prepo;
	
	// post/users/101/posts
	@PostMapping(value = "/users/{id}/posts")
	public String savePost(@PathVariable Integer id,@RequestBody Post post) {
		Optional<User> uop= urepo.findById(id);
		User u=uop.get();
		post.setUser(u);
		prepo.save(post);
		return "POst Created";
	}
	
	// post/users
	@GetMapping(value = "/users")
	public List<User> getAll(){
	return urepo.findAll();	
	}
	
	// post/users
		@GetMapping(value = "/users/{id}/posts")
		public List<Post> getAllPostsBuUserId(@PathVariable Integer id){
		Optional<User> uop=urepo.findById(id);	
		return uop.get().getPost();	
		}
	

}
