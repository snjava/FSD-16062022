<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Personal Details</title>
</head>
<body>
	<div align="center">
		<h1>Step 1 of 3</h1>
		<hr>
		
		<%
			String code = request.getParameter("c");
			String msg = "";
			String color="";
			if(code!=null) {
				switch(code) {
					case "1":
						msg = "Your data has been save successfully.....";
						color= "green";
						break;
					case "0":
						msg = "Your Registration is failed. Please try again.!!";
						color= "red";
						break;
				}
			}
		%>
		
		<h3 style="color: <%=color%>"> <%=msg %></h3>

		<h2><u>User Personal Details</u></h2>
		<form action="user-address.jsp">
			Enter Name : <input type="text" name="name">
			<br><br>
			Enter Email : <input type="text" name="email">
			<br><br>
			Enter Contact : <input type="text" name="contact">
			<br><br>
			<button type="submit">Next</button>
		</form>
	</div>



</body>
</html>