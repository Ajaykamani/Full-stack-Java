<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Congratulations, successfully logged in</h1>

<h2>  Name: <%=session.getAttribute("uname") %></h2>
<h2>  Password: <%=session.getAttribute("pwd") %></h2>



 <!-- <h2>  Name: <%=request.getAttribute("uname") %></h2>
<h2>  Password: <%=request.getAttribute("pwd") %></h2> -->

</body>
</html>