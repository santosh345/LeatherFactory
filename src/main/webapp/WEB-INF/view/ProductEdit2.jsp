<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin:Edit Product</title>
<style>
table, th, td {
   border: 2px solid black;
}
</head>
<body>
<center>
<table>
<tr>
<th>Product ID</th>
<th>Product Name</th>
<th>Product Description</th>
<th>Supplier ID</th>
<th>Category Id</th>
<th>Product Quantity</th>
<th>Product Cost</th>
</tr>
      <tr>
        <td><c:out value="${prFound.productid}" /></td>
        <td><c:out value="${prFound.ProductName}" /></td>
        <td><c:out value="${prFound.productdescription}" /></td>
        <td><c:out value="${prFound.supplierid}" /></td>
        <td><c:out value="${prFound.categoryid}" /></td>
        <td><c:out value="${prFound.productquantity}" /></td>
        <td><c:out value="${prFound.productcost}" /></td>
      </tr>
</table>
<br>
<br>
<form:form action="editProduct" method="post" modelattribute="Product">
Product ID:<form:input path="productid"/><br>
Product Name:<form:input path="ProductName"/><br>
Product Description:<form:input path="productdescription"/><br>
Supplier ID:<form:input path="supplierid"/><br>
Category ID:<form:input path="categoryid"/><br>
Product Quantity:<form:input path="productquantity"/><br>
Product Cost:<form:input path="productcost"/><br>
<input type="submit" value="Edit Product">
</form:form>
</center>
</body>
</html>