<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location</title>
</head>
<body>
<h2>SaveLocation</h2>
<form action="savelocation" method="post">
<pre>
id<input type="text" name="id"/>
code<input type="text" name="code"/>
name<input type="text" name="name"/>
Type:
Urban<input type="radio" name="type" value="urban">
Rural<input type="radio" name="type" value="rural">
<input type="submit" value="save">
</pre>
</form>
${msg }
</body>
</html>