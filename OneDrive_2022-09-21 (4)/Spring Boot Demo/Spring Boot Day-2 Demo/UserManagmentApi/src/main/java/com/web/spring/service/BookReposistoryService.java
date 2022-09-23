package com.web.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.spring.bean.Book;
import com.web.spring.reposistory.BookReposistory;

@Service
public class BookReposistoryService {
     @Autowired
	private BookReposistory brepo;
     
     
    public Book findByName(String name) {
     return	brepo.findByName(name); 
     }
     
 	public List<Book> findByAuthorOrName(String author,String name){
 		 return	brepo.findByAuthorOrName(author,name);
 	}

	
}
