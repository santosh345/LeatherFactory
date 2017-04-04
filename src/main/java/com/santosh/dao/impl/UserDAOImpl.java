package com.santosh.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.santosh.model.User;

@EnableTransactionManagement
@Repository("userDAO")
public class UserDAOImpl {
	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDAOImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory=sessionFactory;		
	}

	@Transactional
	public List<User> getAllUser() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	@Transactional
	public boolean saveUser(User user) {
		try
		{
		sessionFactory.getCurrentSession().save(user);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}	
		}

	@Transactional
	public boolean updateUser(User user) {
		try
		{
		sessionFactory.getCurrentSession().update(user);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean deleteUser(User user) {
		try
		{
		sessionFactory.getCurrentSession().delete(user);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean deleteUser(String id) {
		try {
			sessionFactory.getCurrentSession().delete(getUserById(id));
			return true;
		} 
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public User getUserById(String id) {
		return (User) sessionFactory.getCurrentSession().createQuery("from User where userID ='"+ id +"'" ).uniqueResult();// uniqueresult() or list().get(0);
	}

	@Transactional
	public User getUserByName(String name) {
		return (User) sessionFactory.getCurrentSession().createQuery("from User where userName ='"+ name +"'" ).uniqueResult();// uniqueresult() or list().get(0);
	}
}
