<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="CommonHeader.jsp"></jsp:include>
<center>
<h1>Edit Product</h1>
<div class="container">
  <h2>Available Products</h2>            
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>Product Id</th>
        <th>Product Name</th>
        <th>Product Description</th>
        <th>Supplier Id</th>
        <th>Category Id</th>
        <th>Product Quantity</th>
        <th>Product Cost</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${prList}" var="pList">
      <tr>
        <td><c:out value="${pList.productID}" /></td>
        <td><c:out value="${pList.productName}" /></td>
        <td><c:out value="${pList.productDesc}" /></td>
        <td><c:out value="${pList.supplierID}" /></td>
        <td><c:out value="${pList.categoryID}" /></td>
        <td><c:out value="${pList.productQty}" /></td>
        <td><c:out value="${pList.productCost}" /></td>
      </tr>
       </c:forEach>
    </tbody>
  </table>
</div>
<form action="findProduct">
<h2>Enter Product ID : </h2>
<input type="text" name="pID" /> 
<input type="submit" value="Edit">
</form>
</center>
</body>
</html>