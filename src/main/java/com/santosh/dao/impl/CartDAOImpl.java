package com.santosh.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.santosh.dao.CartDAO;

@EnableTransactionManagement
@Repository("cartDAO")
public class CartDAOImpl implements CartDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CartDAOImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory=sessionFactory;		
	}

	public List<Cart> getAllCart() {
		return sessionFactory.getCurrentSession().createQuery("from Cart").list();

	}

	public boolean saveCart(Cart cart) {
		try
		{
		sessionFactory.getCurrentSession().save(cart);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateCart(Cart cart) {
		try
		{
		sessionFactory.getCurrentSession().update(cart);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteCart(Cart cart) {
		try
		{
		sessionFactory.getCurrentSession().delete(cart);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteCart(String id) {
		try {
			sessionFactory.getCurrentSession().delete(getCartById(id));
			return true;
		} 
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Cart getCartById(String id) {
		return (Cart) sessionFactory.getCurrentSession().createQuery("from Cart where id ="+ id +"" ).uniqueResult();// uniqueresult() or list().get(0);

	}
}

