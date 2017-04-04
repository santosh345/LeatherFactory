package com.santosh.dao;

import java.util.List;

import com.santosh.model.Supplier;

public interface SupplierDAO {
public List<Supplier> getAllSupplier();
	
	public boolean saveSupplier(Supplier supplier);
	
	public boolean updateSupplier(Supplier supplier);
	
	public boolean deleteSupplier(Supplier supplier);
	
	public boolean deleteSupplier(String id);
	
	public Supplier getSupplierById(String id);
	
	public Supplier getSupplierByName(String name);
	
}
