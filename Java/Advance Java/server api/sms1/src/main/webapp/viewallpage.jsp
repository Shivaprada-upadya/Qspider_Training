<%@page import="java.sql.ResultSet" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<table border="1" >
		
		<tr>
		
		<th> ID </th>
		<th> NAME </th>
		<th> EMAIL </th>
		<th> Phone </th>
		<th colspan="2"> ACTION </th>	
		</tr>
		<% ResultSet res= (ResultSet)request.getAttribute("rs");


		while(res.next()) {
		%>
		<tr>
		<td><%= res.getInt(1) %></td>
		<td><%= res.getString(2)%></td>
		<td><%= res.getString(3)%></td>
		<td> <%= res.getLong(4) %>  </td>
		<td> <a href="delete?id=<%=res.getInt(1)%>"><button>Delete</button></a></td>
		<td>  <a href="update?id=<%=res.getInt(1)%>"><button>Update</button>  </a> </td>	
		</tr>
		<%} %>
		
		</table>
		
		<a href="index.jsp" ><button>Add New Employee Data</button></a>

</body>
</html>