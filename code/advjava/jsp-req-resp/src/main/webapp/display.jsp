<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Message</title>
</head>
<body>
<div align="center">

<% 
	String name = request.getParameter("name");
	String message = request.getParameter("msg");
%>
	<h1>Hello, <%= name %> </h1>
	<h2>Your Message is, <%= message %> </h2>
</div>
</body>
</html>