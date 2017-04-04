package com.santosh.dao.impl;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.santosh.dao.CategoryDAO;
import com.santosh.model.Category;
@Transactional
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public CategoryDAOImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory=sessionFactory;		
	}
	
	public List<Category> getAllCategories() {

		return sessionFactory.getCurrentSession().createQuery("from Category").list();
	}
    @Transactional
	public boolean saveCateogory(Category category) {
		try
		{
		sessionFactory.getCurrentSession().save(category);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
    @Transactional
	public boolean updateCategory(Category category) {
		try
		{
		sessionFactory.getCurrentSession().update(category);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
    @Transactional
	public boolean deleteCategory(Category category) {
		try
		{
		sessionFactory.getCurrentSession().delete(category);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	    }

    @Transactional
	public boolean deleteCategory(String id) {
		try {
			sessionFactory.getCurrentSession().delete(getCategoryById(id));
			return true;
		} 
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Category getCategoryById(String id) 
	{
		return (Category) sessionFactory.getCurrentSession().createQuery("from category where id="+ id +"").uniqueResult();
	}

	public Category getCategoryByName(String name) {
		
		return (Category) sessionFactory.getCurrentSession().createQuery("from category where id="+ name +"").list().get(0);

	}
}
