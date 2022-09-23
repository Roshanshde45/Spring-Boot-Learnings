package com.web.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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
 	
 	@Transactional
 	public void deleteByName(String name) {
 		brepo.deleteByName(name);
 		
 	}
 	
 	


public List<Book> getAllBooksJpql() {
return brepo.getAllBooksJpql();	
}


public  List<Book> getAllBooksSql(){
	
return brepo.getAllBooksSql();	
}


public  List<Book>  listBookByAuthor(String author){
	
	return brepo.listBookByAuthor(author);
}


public  List<Book>  listBookByPrice(Integer p){
	return brepo.listBookByPrice(p);
}

 	
 	

	
}
