<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<%
	String user = (String) session.getAttribute("un");
%>

<div align="center">
	<h1>Welcome User, <%= user %> </h1>

</div>

</body>
</html>