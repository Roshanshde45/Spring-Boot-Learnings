package com.web.spring.reposistory;
import java.util.List;
import org.springframework.data.repository.Repository;
import com.web.spring.bean.Book;
@org.springframework.stereotype.Repository
public interface BookReposistory extends Repository<Book, Integer> {
Book findByName(String name); 
List<Book> findByAuthorOrName(String author,String name);

}
