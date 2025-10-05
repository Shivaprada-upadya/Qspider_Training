<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome to Student Portal</h1>
<form action="save">
	<input type="text" name="id" placeholder="Enter id">
	<input type="text" name="name" placeholder="Enter name">
	<input type="text" name="email" placeholder="Enter email">
	<input type="text" name="phone" placeholder="Enter phone">
	<button type="submit" >Submit</button>
</form>

<a href="viewall" > <button>View All Students</button></a>
</body>
</html>