<%@page import="java.sql.ResultSet"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			<h1>Update Page</h1>
			
			<%ResultSet res= (ResultSet) request.getAttribute("res");%>
			
		<form action="updatepage">
		<input type="text" name="id" value="<%=res.getString(1)%>" readonly="readonly">
		<input type="text" name="name" value="<%= res.getString(2)%>">
		<input type="text" name="email"  value="<%= res.getString(3)%>"  >
		<input type="text" name="phone" value="<%= res.getString(4)%>"    >
		<button type="submit">update</button>
		
		</form>

	
</body>
</html>