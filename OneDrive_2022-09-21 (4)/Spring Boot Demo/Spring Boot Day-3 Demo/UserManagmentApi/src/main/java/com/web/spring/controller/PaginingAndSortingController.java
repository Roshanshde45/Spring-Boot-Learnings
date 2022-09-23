package com.web.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.spring.bean.Book;
import com.web.spring.service.PaginingAndSortingService;

@RestController
@RequestMapping("sortapi")
public class PaginingAndSortingController {
	@Autowired
	private PaginingAndSortingService service;
	// sortapi/books
	@GetMapping(value = "/books" ,produces =   {"application/json"})
	public Iterable<Book>  findAllBooks (){
		return   service.findAllBooks();
	}
	//sortapi/bpaginated?pageNo=0
	@GetMapping(value = "/bpaginated" ,produces =   {"application/json"})
	public List<Book> getBooksPaginated(@RequestParam Integer pageNo){
	 return service.getBooksPaginated(pageNo);
			
	}
	//sortapi/bpaginatedandsorted?pageNo=0&sortKey=name
	@GetMapping(value = "/bpaginatedandsorted" ,produces =   {"application/json"})
	public List<Book> getBooksPaginatedAndSorted(@RequestParam Integer pageNo,@RequestParam String sortKey){
	return service.getBooksPaginatedAndSorted(pageNo, sortKey);
	}
		

	


}
