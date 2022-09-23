package com.web.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.web.spring.bean.Book;
import com.web.spring.reposistory.PaginingAndSortingRepo;

@Service
public class PaginingAndSortingService {
	@Autowired
	private PaginingAndSortingRepo repo;
	
	private final static int PAGESIZE=3;
	
	public Iterable<Book>  findAllBooks (){
		return   repo.findAll();
	}
	
	public List<Book> getBooksPaginated(Integer pageNo){
	Pageable pagable = PageRequest.of(pageNo,PAGESIZE);
	List<Book> blist= new ArrayList<>();
	Page<Book>   pageResult = repo.findAll(pagable);
	blist=pageResult.getContent();
	return blist;
		
	}
	
	public List<Book> getBooksPaginatedAndSorted(Integer pageNo,String sortKey){
		Pageable pagable = PageRequest.of(pageNo,PAGESIZE, Sort.by(sortKey));
		List<Book> blist= new ArrayList<>();
		Page<Book>   pageResult = repo.findAll(pagable);
		blist=pageResult.getContent();
		return blist;
			
		}
		

	
	

}
