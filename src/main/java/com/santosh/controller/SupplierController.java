package com.santosh.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.santosh.dao.SupplierDAO;
import com.santosh.model.Supplier;


@Controller
public class SupplierController {
@Autowired
private SupplierDAO supplierDAO;

@RequestMapping("/selAddSupplier")
public ModelAndView showAddSupplier()
{
	ModelAndView mv=new ModelAndView("/AddSupplier","command", new Supplier());
	return mv;
}

@RequestMapping(value="/addSupplier",  method = RequestMethod.POST)
public ModelAndView addCategoryFunction(@ModelAttribute Supplier supplier)
{
	supplierDAO.saveSupplier(supplier);
	ModelAndView mv= new ModelAndView("/Admin");
	mv.addObject("msg", "Supplier ADDED");
	return mv;
}

@RequestMapping("/selEditSupplier")
public ModelAndView showSupplierEdit(Map<String, Object> map)
{
	List<Supplier> suppList=supplierDAO.getAllSupplier();
	map.put("spList", suppList );
	ModelAndView mv=new ModelAndView("/EditSupplier",map);
	return mv;
}

@RequestMapping("/findSupplier")
public ModelAndView findSupplier(@RequestParam("sID") String spID, Map<String, Object> map)
{
	System.out.println("Inside Supplier find");
	Supplier supplier=supplierDAO.getSupplierById(spID);
	ModelAndView mv=new ModelAndView("/EditSupplier2","command", new Supplier() );
	mv.addObject("spFound", supplier);
	return mv;
}

@RequestMapping(value="/editSupplier",  method = RequestMethod.POST)
public ModelAndView editSupplierFunction(@ModelAttribute Supplier supplier,@RequestParam("spID") String sID)
{
	supplier.setSupplierID(sID);
	supplierDAO.updateSupplier(supplier);
	ModelAndView mv= new ModelAndView("/Admin");
	mv.addObject("msg", "Supplier Edited");
	return mv;
}

@RequestMapping("/selDeleteSupplier")
public ModelAndView deleteSupplierFunction()
{
	ModelAndView mv=new ModelAndView("/DeleteSupplier");
	return mv;
}

@RequestMapping("/deleteSupplier")
public ModelAndView deleteSupplier(@RequestParam("sID") String spID)
{
	supplierDAO.deleteSupplier(spID);
	ModelAndView mv=new ModelAndView("/Admin");
	return mv;
}

@RequestMapping("/selViewSupplier")
public ModelAndView viewSupplier(Map<String, Object> map)
{
	List<Supplier> suppList=supplierDAO.getAllSupplier();
	map.put("spList", suppList );
	ModelAndView mv=new ModelAndView("/SupplierView",map);
	return mv;
}
}
