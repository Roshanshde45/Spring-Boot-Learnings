package com.web.spring.reposistory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.spring.bean.User;
@Repository
public interface UserCrudReposistory extends CrudRepository<User, Integer> {

}
