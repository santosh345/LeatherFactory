package com.santosh.dao;

import java.util.List;

import com.santosh.model.User;

public class UserDAO {
public List<User> getAllUser();
	
	public boolean saveUser(User user);
	
	public boolean updateUser(User user);
	
	public boolean deleteUser(User user);
	
	public boolean deleteUser(String id);
	
	public User getUserById(String id);
	
	public User getUserByName(String name);

}
