<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<title>Admin : Edit Category</title>
</head>
<body>
<jsp:include page="CommonHeader.jsp"></jsp:include>
<center>
<h1>Edit Category</h1>
<div class="container">
  <h2>Available Categories</h2>            
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>Category Id</th>
        <th>Category Name</th>
        <th>Category Description</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${crList}" var="cList">
      <tr>
        <td><c:out value="${cList.categoryID}" /></td>
        <td><c:out value="${cList.categoryName}" /></td>
        <td><c:out value="${cList.categorydescription}" /></td>
      </tr>
       </c:forEach>
    </tbody>
  </table>
</div>
<form action="findCategory">
<h2>Enter Category ID : </h2>
<input type="text" name="cID" /> 
<input type="submit" value="Edit">
</form>
</center>
</body>
</html>