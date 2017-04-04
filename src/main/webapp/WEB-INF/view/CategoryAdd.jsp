<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="Resources/Bootstrap/bootstrap.min.css">
<title>Admin : Category Add</title>
</head>
<body>
<center><p>Enter the Category Details</p>
<form:form method="post" action="addCategory" modelattribute="Category">
<div class="form-group">
<label for="title">Category ID:</label>
<form:input type="text" path= "categid"/>
</div><br>
<div class="form-group">
<label for="title">Category Name:</label>
<form:input type="text" path="categname"/>
</div><br>
<div class="form-group">
<label for="title">Category Description:</label>
<form:input type="text" path="categdescription"/>
</div><br>
<input type="submit" value="Add Category">
</form:form>
</center>
</body>
</html>