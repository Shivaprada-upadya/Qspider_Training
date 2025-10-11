<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1> Welcome to Emplyoee Portal </h1>
	
	<form action="save">
	
	<input type="text" name="id" placeholder="enter id">
	<input type="text" name="name" placeholder="enter name">
	<input type="text" name="email" placeholder="enter email">
	<input type="text" name="phone" placeholder="enter phone">
	<button type="submit">Submit</button>
	</form>
	<br/>
	<a href="viewall"><button> View All Employees</button></a>
</body>
</html>