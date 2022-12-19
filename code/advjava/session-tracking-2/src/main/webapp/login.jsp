<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<div align="center">
	<%
		// to Get the cookie from the request
		Cookie cks[] = request.getCookies(); 
		String value = "";
		if(cks!=null) {
			for(Cookie ck : cks) {
				if("user".equals(ck.getName())) {
					value = ck.getValue();
				}
			}
		}
	
	%>
	<h1>Previously Logged-in User</h1>
	<h3 style="color: green;"><%= value %></h3>

</div>

<hr>

<div align="center">

	<%
			String code = request.getParameter("c");
			String msg = "";
			String color="";
			if(code!=null) {
				switch(code) {
					case "-1":
						msg = "Incorrect User name or passoword. Please try again.!!";
						color= "red";
						break;
				}
			}
		%>

	<h3 style="color:<%=color%>"> <%= msg %>   </h3>

	<form action="auth">
		Enter User Name : <input type="text" name="uname">
		<br><br>
		Enter Password : <input type="password" name="upass"> 
		<br><br>
		<button type="submit">Login</button> 
	</form>

</div>

</body>
</html>