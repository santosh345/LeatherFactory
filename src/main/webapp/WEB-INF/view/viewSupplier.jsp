<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<title>Admin : View Supplier</title>
</head>
<body>
<jsp:include page="CommonHeader.jsp"></jsp:include>
<center>
<h1>View Supplier</h1>
<div class="container">
  <h2>Available Suppliers</h2>            
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>Supplier Id</th>
        <th>Supplier Name</th>
        <th>Supplier Address</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${spList}" var="sList">
      <tr>
        <td><c:out value="${sList.supplierID}" /></td>
        <td><c:out value="${sList.supplierName}" /></td>
        <td><c:out value="${sList.supplieraddress}" /></td>
      </tr>
       </c:forEach>
    </tbody>
  </table>
</div>
</center>
</body>
</html>