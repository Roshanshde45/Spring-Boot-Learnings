package com.web.spring.reposistory;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.web.spring.bean.Book;
@Repository
public interface PaginingAndSortingRepo extends PagingAndSortingRepository<Book, Integer> {

}
