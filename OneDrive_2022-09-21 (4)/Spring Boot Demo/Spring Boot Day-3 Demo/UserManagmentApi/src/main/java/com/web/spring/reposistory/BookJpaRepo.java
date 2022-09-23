package com.web.spring.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.spring.bean.Book;
@Repository
public interface BookJpaRepo extends JpaRepository<Book, Integer> {

}
