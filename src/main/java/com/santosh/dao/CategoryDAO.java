package com.santosh.dao;
import java.util.List;

import com.santosh.model.Category;


public interface CategoryDAO {
			public List<Category> getAllCategories();
			
			public boolean saveCateogory(Category category);
			
			public boolean updateCategory(Category category);
			
			public boolean deleteCategory(Category category);
		
			public boolean deleteCategory(String id);
			
			public Category getCategoryById(String id);
			
			public Category getCategoryByName(String name);
}
