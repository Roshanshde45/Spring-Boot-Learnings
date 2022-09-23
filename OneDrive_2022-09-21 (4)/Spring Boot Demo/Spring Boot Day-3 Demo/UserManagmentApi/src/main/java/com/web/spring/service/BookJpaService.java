package com.web.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.spring.bean.Book;
import com.web.spring.reposistory.BookJpaRepo;

@Service
public class BookJpaService {
	@Autowired
	private BookJpaRepo repo;
	@Transactional
	public void deletInBatch(List<Book> blist) {
	repo.deleteInBatch(blist);	
	}

}
