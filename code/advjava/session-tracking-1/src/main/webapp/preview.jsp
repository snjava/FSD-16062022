<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Preview Page</title>
</head>
<body>

<%
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String contact = request.getParameter("contact");
	
	String city = request.getParameter("city");
	String pincode = request.getParameter("pin");
	String state = request.getParameter("state");

%>

<div align="center">
	<h1>Step 3 of 3</h1>
	<hr>
	<h2><u>Personal Details </u></h2>
	<h3>Name : <%= name %> </h3>
	<h3>Email : <%= email %> </h3>
	<h3>Contact : <%= contact %> </h3>
	
	
	<h2><u>Address Details </u></h2>
	<h3>City : <%= city %> </h3>
	<h3>Pincode : <%= pincode %> </h3>
	<h3>State : <%= state %> </h3>

	<h1>  <a href="register-user?name=<%=name%>&email=<%=email%>&contact=<%=contact%>&city=<%=city%>&pin=<%=pincode%>&state=<%=state%>">Save</a> </h1>

</div>


</body>
</html>