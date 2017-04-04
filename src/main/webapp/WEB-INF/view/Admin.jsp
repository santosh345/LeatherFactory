<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Leather Factory</title>
<script type="text/javascript">
function cFunc()
{
	var cform_value=document.getElementById('sel1').value;
	if(cform_value=="AddProduct")
	{
	window.location="selAddProduct";
	}
	if(cform_value=="EditProduct")
	{
	window.location="selEditProduct";
	}
	if(cform_value=="DeleteProduct")
	{
	window.location=="selDeleteProduct"	;
	}
	if(cform_value=="ProductView")
	{
	window.location="selProductView";
	}
}
	function cFunc1()
	{
		var cform1_value=document.getElementById('sel2').value;
		if(cform1_value=="AddCategory")
		{
		window.location="selAddCategory";
		}
		if(cform1_value=="EditCategory")
		{
		window.location="selEditCategory";
		}
		if(cform1_value=="DeleteCategory")
		{
		window.location=="selDeleteCategory";
		}
		if(cform1_value=="ViewCategory")
		{
		window.location="selViewCategory";
		}
		
	}
		function cFunc2()
		{
			var cform2_value=document.getElementById('sel3').value;
			if(cform2_value=="AddSupplier")
			{
			window.location="selAddSupplier";
			}
			if(cform2_value=="EditSupplier")
			{
			window.location="selEditSupplier";
			}
			if(cform2_value=="DeleteSupplier")
			{
			window.location=="selDeleteSupplier";
			}
			if(cform2_value=="ViewSupplier")
			{
			window.location="selViewSupplier";
			}
		    
		}
</script>

</head>
<body>
 <jsp:include page="CommonHeader.jsp"></jsp:include>
<div class="container">        
  <table class="table">
    <thead>
      <tr>
        <th>Product</th>
        <th>Category</th>
        <th>Supplier</th>
      </tr>
    </thead>

    <tbody>
      <tr>
        <td>
      <select class="form-control" id="sel1" onchange="cFunc()">
      	<option>--Select--</option>
        <option value="AddProduct">Add</option>
        <option value="EditProduct">Edit</option>
        <option value="DeleteProduct">Delete</option>
        <option value="ViewProduct">View</option>
      </select>
        </td>
        <td>
      <select class="form-control" id="sel2" onchange="cFunc1()">
      <option>--Select--</option>
        <option value="AddCategory">Add</option>
        <option value="EditCategory">Edit</option>
        <option value="DeleteCategory">Delete</option>
        <option value="ViewCategory">View</option>
      </select>
        </td>
        <td>
        <select class="form-control" id="sel3" onchange="cFunc2()">
        <option>--Select--</option>
        <option value="AddSupplier">Add</option>
        <option value="EditSupplier">Edit</option>
        <option value="DeleteSupplier">Delete</option>
        <option value="ViewSupplier">View</option>
      </select>
        </td>
      </tr>      
     
    </tbody>
 
  </table>
  
</div>
 <center>This is admin page</center>
 <jsp:include page="CommonFooter.jsp"></jsp:include>
</body>
</html>