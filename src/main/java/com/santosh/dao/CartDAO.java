package com.santosh.dao;

import java.util.List;

public interface CartDAO {

	 List<Cart> getAllCart();
		
		public boolean saveCart(Cart cart);
		
		public boolean updateCart(Cart cart);
		
		public boolean deleteCart(Cart cart);
		
		public boolean deleteCart(String id);
		
		public Cart getCartById(String id);
		
		

}
