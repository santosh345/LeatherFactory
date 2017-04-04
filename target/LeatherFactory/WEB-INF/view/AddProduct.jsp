<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<title>Admin:AddProduct</title>
</head>
<body>
<center><p>Enter the Product Details</p>
<form:form action="addProduct" method="post" modelattribute="Product">
<form class="form-horizontal">
<div class="col-xs-6">  
<div class="input-group">
<span class="input-group-addon"><!---->Product Id</span>
<input type="text" class="form-control" id="productid" placeholder="Enter Product ID">
 </div>
  <br>
   <div class="input-group">
   <span class="input-group-addon"> Product Name </span>
    <input type="text" class="form-control" id="ProductName" placeholder="Enter Product Name">
    </div>
    <br>
    <div class="input-group">
    <span class="input-group-addon"> Product Desc </span>
    <input type="text" class="form-control" id="productdescription" placeholder="Enter Product Desc">
    </div>
    <br>
    <div class="input-group">
     <span class="input-group-addon"> Supplier ID </span>
      <input type="text" class="form-control" id="supplierid" placeholder="Enter Supplier ID">
    </div>
    <br>
     <div class="input-group">
     <span class="input-group-addon"> Category ID </span>
      <input type="text" class="form-control" id="categoryid" placeholder="Enter Category ID">
    </div>
    <br>
    <div class="input-group">
	<span class="input-group-addon"> Product Quantity </span>
      <input type="text" class="form-control" id="productquantity" placeholder="Enter Product Quantity">
    </div>
    <br>
    <div class="input-group">
      <span class="input-group-addon"> Product Cost </span>
      <input type="text" class="form-control" id="productcost" placeholder="Enter Product cost">
    </div>
    <br>
    <button type="submit" class="btn btn-default"> Add Product </button>
    </div>
  </form:form>
  </center>
</body>
</html>