package com.santosh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="category")
@Component	
public class Category {
	@Id
	private String categid;
	
	@Column(name="Category name")
	private String categname;
	
	@Column(name="Category description")
	private String categdescription;

	public String getCategid() {
		return categid;
	}

	public void setCategid(String categid) {
		this.categid = categid;
	}

	public String getCategname() {
		return categname;
	}

	public void setCategname(String categname) {
		this.categname = categname;
	}

	public String getCategdescription() {
		return categdescription;
	}

	public void setCategdescription(String categdescription) {
		this.categdescription = categdescription;
	}	
}
