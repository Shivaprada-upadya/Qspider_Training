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
	<table border="1" rules="all" cellspacing="5px" cellpadding="5px">
		<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>EMAIL</th>
		<th>PHONE</th>
		<th colspan="2">ACTION </th>
		</tr>
		 <%	 
		 ResultSet res= (ResultSet)request.getAttribute("rs");
		 
		while(res.next()){
		%>
		<tr>
		<td> <%= res.getString(1)%> </td>
		<td><%= res.getString(2)%> </td>
		<td><%= res.getString(3)%> </td>
		<td><%= res.getString(4)%>	</td>
		<td> <a href="delete?id=<%=res.getString(1)%>"><button>Delete</button></a> </td>
		<td>   <a href="update?id=<%=res.getString(1)%>"><button>Update</button></a>   </td>
		</tr>
		<% 
		}
		%>
	</table>
</body>
</html>