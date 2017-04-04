package com.santosh.dao.impl;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.santosh.dao.ProductDAO;
import com.santosh.model.Product;

@EnableTransactionManagement
@Repository("productDAO")

public class ProductDAOImpl implements ProductDAO 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public ProductDAOImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory=sessionFactory;		
	}

	@Transactional
	public List<Product> getAllProduct() 
	{
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}
	@Transactional
	public boolean saveProduct(Product product)
	{
		try
		{
	sessionFactory.getCurrentSession().save(product);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	@Transactional
	public boolean updateProduct(Product product) 
	{
		try
		{
		sessionFactory.getCurrentSession().update(product);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();

	return false;
	}
	}
	@Transactional
	public boolean deleteProduct(Product product)
	{
		try
		{
		sessionFactory.getCurrentSession().delete(product);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}	
	}
	@Transactional
	public boolean deleteProduct(int id)
	{
		try {
			sessionFactory.getCurrentSession().delete(getProductById(id));
			return true;
		} 
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
    
	@Transactional
	public Product getProductById(int id)
	{
		return (Product) sessionFactory.getCurrentSession().createQuery("from Product where productID ="+ id +"" ).uniqueResult();	
	}

	public Product getProductByName(String name) 
	{
		return (Product) sessionFactory.getCurrentSession().createQuery("from Product where id ="+ name +"" ).list().get(0);
	}

	public boolean deleteProduct(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Product getProductById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	}
