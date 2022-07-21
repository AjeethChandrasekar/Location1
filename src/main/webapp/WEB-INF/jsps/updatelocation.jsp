<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
<h2>UpdateLocation</h2>
<form action="updatelocation" method="post">
<pre>
id<input type="text" name="id" value="${location.id}"/>
code<input type="text" name="code"  value="${location.code}"/>
name<input type="text" name="name" value="${location.name}"/>
Type:
Urban<input type="radio" name="type" value="urban">
Rural<input type="radio" name="type" value="rural">
<input type="submit" value="save">
</pre>
</form>
</body>
</html>