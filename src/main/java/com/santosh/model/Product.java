package com.santosh.model;

import java.beans.Transient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="Product")
@Component
public class Product 
{
	
	@Id
	private int productid;
	
	@Column(name="ProductName")
	private String ProductName;
	
	@Column(name="productdescription")
	private String productdescription;
	
	@Column(name="supplierid")
    private String supplierid;
	
	@Column(name="categoryid")
    private String categoryid;
	
	@Column(name="productquantity")
    private int productquantity;
	
	@Column(name="productcost")
    private int productcost;
	
	//@Transient
	MultipartFile pimage;
	public MultipartFile getPimage() {
		return pimage;
	}
	public void setPimage(MultipartFile pimage) {
		this.pimage = pimage;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}
	
	public String getProductName() {
		return ProductName;
	}
	
	public void setProductName(String productName) {
		this.ProductName = productName;
	}

	public String getProductdescription() {
		return productdescription;
	}
	
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}
	
	public String getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(String supplierid) {
		this.supplierid = supplierid;
	}
	
	public String getCategoryid() {
		return categoryid;
	}
	
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}
	
	public int getProductquantity() {
		return productquantity;
	}

	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}
	
	public int getProductcost() {
		return productcost;
	}
	
	public void setProductcost(int productcost) {
		this.productcost = productcost;
	}
	
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", ProductName=" + ProductName + ", productdescription=" + productdescription
				+ ", supplierid=" + supplierid + ", categoryid=" + categoryid
				+ ", productquantity=" + productquantity + ", productcost=" + productcost + "]";
	}
		
	}

