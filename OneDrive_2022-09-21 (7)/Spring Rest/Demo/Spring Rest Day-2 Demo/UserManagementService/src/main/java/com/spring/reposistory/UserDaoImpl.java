package com.spring.reposistory;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao{
	@Autowired
	private SessionFactory sf;
	Session session;

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		session = sf.openSession();
		Transaction tx= session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
		return user;
	}

	@Override
	public List<User> listUsers() {
		// TODO Auto-generated method stub
		session=sf.openSession();
		List<User> user= session.createQuery("from User").list();
		session.close();
		return user;
	}

}
