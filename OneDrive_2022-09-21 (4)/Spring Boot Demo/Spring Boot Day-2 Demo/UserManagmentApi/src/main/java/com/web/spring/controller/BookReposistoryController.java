package com.web.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.spring.bean.Book;
import com.web.spring.service.BookReposistoryService;

@RestController
@RequestMapping("book")
public class BookReposistoryController {
	@Autowired
	private BookReposistoryService service;
	// book/books?name=Spring
	@GetMapping(value = "books") 
    public Book findByName(@RequestParam String name) {
     return	service.findByName(name); 
     }
	// book/books1?author=Andy&name=Spring
	@GetMapping(value = "books1") 
 	public List<Book> findByAuthorOrName(@RequestParam String  author,@RequestParam String name){
 		 return	service.findByAuthorOrName(author,name);
 	}

}
