<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scripting Tag Demo</title>
</head>
<body>

<% 
	int x = 20;
	for(int i =1 ; i<=10; i++) {
		System.out.println(i);
	}
%>

<%= "Square = " + x*x %>


<%!
	static int a = 10;
	public void test() {
		System.out.println(a);		
	}
%>

</body>
</html>