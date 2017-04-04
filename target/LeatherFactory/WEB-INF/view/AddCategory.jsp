<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin :Add Category</title>
</head>
<body>
<jsp:include page="CommonHeader.jsp"></jsp:include>
<center><p>Enter the Category Details</p>
<form:form method="post" action="CategoryAdd" modelattribute="Category">
ID:<form:input path="categid"/><br>
Name:<form:input path="categname"/><br>
Description:<form:input path="categdescription"/><br>
<input type="submit" value="AddCategory">
</form:form>
</center>
</body>
</html>