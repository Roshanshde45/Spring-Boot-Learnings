package com.web.spring.reposistory;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.web.spring.bean.Book;
@org.springframework.stereotype.Repository
public interface BookReposistory extends Repository<Book, Integer> {
	
Book findByName(String name); 
List<Book> findByAuthorOrName(String author,String name);
void deleteByName(String name);

@Query(value = "from Book")
List<Book> getAllBooksJpql();

@Query(value = "select * from Book_Info", nativeQuery = true)
List<Book> getAllBooksSql();

@Query(value = "select * from Book_Info b where b.author=?1", nativeQuery = true)
List<Book>  listBookByAuthor(String author);

@Query(value = "select b from Book b where b.price>:p")
List<Book>  listBookByPrice(@Param("p") Integer p);












}
