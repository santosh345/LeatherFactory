<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin :Delete Supplier</title>
</head>
<body>
<form:form method="post" action="DeleteSuuplier" modelattribute="Supplier">
<h2>Enter Supplier ID : </h2>
<input type="text" name="sID" /> 
<input type="submit" value="Delete">
</form:form>
</body>
</html>