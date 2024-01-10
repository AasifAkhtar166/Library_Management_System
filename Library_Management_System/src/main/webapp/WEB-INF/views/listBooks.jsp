<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Books</title>
</head>
<body>
<h2>All Books</h2>
<table border="1">
<tr>
<th>Title</th>
<th>Author</th>
</tr>


<%
ResultSet result = (ResultSet)request.getAttribute("res");
while(result.next()){%>
<tr>
<td><%=result.getString(1)%></td>
<td><%=result.getString(2)%></td>
<%-- <td><a href="delete?emailId=<%=result.getString(3)%>">delete</a></td>
<td><a href="update?emailId=<%=result.getString(3)%>&mobile=<%=result.getString(4)%>">update</a></td> --%>
</tr>

<%}%>
</table>

</body>
</html>