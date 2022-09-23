package com.web.spring.controller;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.spring.bean.Book;
import com.web.spring.service.BookJpaService;
import com.web.spring.service.BookReposistoryService;

@RestController
@RequestMapping("book")
public class BookReposistoryController {
	@Autowired
	private BookReposistoryService service;
	@Autowired
	private BookJpaService  jpaservice;
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
	
	// book/delete?name=Spring
	
	@DeleteMapping(value = "delete")
	public String deleteByName(@RequestParam String name) {
 		service.deleteByName(name);
 		return "Book Deleted with name "+name;
 		
 	}
	// book/booksjpql	
	
@GetMapping(value = "booksjpql" , produces = {"application/json"}) 
public List<Book> getAllBooksJpql() {
return service.getAllBooksJpql();	
}
//book/bookssql
@GetMapping(value = "bookssql" , produces = {"application/json"}) 
public  List<Book> getAllBooksSql(){
	
return service.getAllBooksSql();	
}
//book/bauthor?author=Amit
@GetMapping(value = "bauthor" , produces = {"application/json"}) 
public  List<Book>  listBookByAuthor(@RequestParam String author){
	
	return service.listBookByAuthor(author);
}
//book/bprice?price=6000
@GetMapping(value = "bprice" , produces = {"application/json"}) 
public  List<Book>  listBookByPrice(@RequestParam Integer price){
	return service.listBookByPrice(price);
}
// /book/deleteinbatch
@DeleteMapping(value = "/deleteinbatch")
public String deletInBatch(@RequestBody List<Book> books) {
jpaservice.deletInBatch(books);
return "Books Deleted..";
}


}
