<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
</head>
<body>
<h2>Add Book</h2>
    <form action="addBook" method="post">
        <label for="title">Title:</label>
        <input type="text" id="title" name="title" required><br>
        
        <label for="author">Author:</label>
        <input type="text" id="author" name="author" required><br>

        <input type="submit" value="Add Book">
    </form>
    
 <%
if(request.getAttribute("msg")!=null){
out.println(request.getAttribute("msg"));
}

%>

</body>
</html>