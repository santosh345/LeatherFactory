package com.santosh.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="cart")
@Component
public class Cart {
	
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private String cartId;
		
		private String user_Id;
		
		private String address;
		
		private String delivery_name;
		
		private double user_contact;
		
		@ElementCollection
		private Set<Product> productsinCart= new HashSet<Product>();

		public String getCartId() {
			return cartId;
		}

		public void setCartId(String cartId) {
			this.cartId = cartId;
		}

		public String getUser_Id() {
			return user_Id;
		}

		public void setUser_Id(String user_Id) {
			this.user_Id = user_Id;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getDelivery_name() {
			return delivery_name;
		}

		public void setDelivery_name(String delivery_name) {
			this.delivery_name = delivery_name;
		}

		public double getUser_contact() {
			return user_contact;
		}

		public void setUser_contact(double user_contact) {
			this.user_contact = user_contact;
		}

		public Set<Product> getProductsinCart() {
			return productsinCart;
		}

		public void setProductsinCart(Set<Product> productsinCart) {
			this.productsinCart = productsinCart;
		}


}
