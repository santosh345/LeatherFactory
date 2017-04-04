package com.santosh.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.santosh.dao.ProductDAO;
import com.santosh.model.Product;
@Controller
public class ProductController
{
@Autowired
private ProductDAO productDAO;

@RequestMapping("/selAddProduct")
public ModelAndView showAddProduct()
{
System.out.println("Run success");
ModelAndView mv=new ModelAndView("/AddProduct","command",new Product());
return mv;
}
@Transactional
@RequestMapping(value="/addProduct",method=RequestMethod.POST)
public  ModelAndView addProductFunction(@ModelAttribute Product Product)
{
	System.out.println("Inside Add product function");
    productDAO.saveProduct(Product);
    ModelAndView mv=new ModelAndView("/Admin");
    mv.addObject("msg","Product Added");
    return mv;
}
@RequestMapping("/selEditProduct")
public ModelAndView showProductEdit(Map<String, Object> map)
{
	List<Product> prodList=productDAO.getAllProduct();
	map.put("prList", prodList );
	ModelAndView mv=new ModelAndView("/ProductEdit",map);
	return mv;
}

@RequestMapping("/findProduct")
public ModelAndView findProduct(@RequestParam("pID") String prID, Map<String, Object> map)
{
	Product pr=productDAO.getProductById(prID);
	ModelAndView mv=new ModelAndView("/EditProduct2","command", new Product() );
	mv.addObject("prFound", pr);
	return mv;
}
@RequestMapping("/selDeleteProduct")
public ModelAndView deleteProductFunction()
{
	ModelAndView mv=new ModelAndView("/DeleteProduct");
	return mv;
}

@RequestMapping("/deleteProduct")
public ModelAndView deleteProduct(@RequestParam("pID") String prID)
{
	productDAO.deleteProduct(prID);
	ModelAndView mv=new ModelAndView("/Admin");
	return mv;
}
}
