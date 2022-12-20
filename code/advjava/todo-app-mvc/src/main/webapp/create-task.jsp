<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create New Task</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	
	<div align="center">
		<%
			String code = request.getParameter("c");
			String msg = "";
			String color="";
			if(code!=null) {
				switch(code) {
					case "1":
						msg = "Your Task been created successfully.....";
						color= "green";
						break;
					case "0":
						msg = "Your Task Creation failed. Please try again.!!";
						color= "red";
						break;
				}
			}
		%>
		
		<h3 style="color: <%=color%>"> <%=msg %></h3>
		<form action="add-task">
			Enter Title : <input type="text" name="title">
			<br><br>
			Enter Status : 
				<select name="status">
					<option value="Open">Open</option>
					<option value="Inprogress">Inprogress</option>
					<option value="Close">Close</option>
				</select>
			<br><br>
			Enter Schedule Date : <input type="date" name="scheduledDt">
			<br><br>
			<button type="submit">Create Task</button>
		
		</form>
	</div>


	<%@ include file="footer.jsp" %>
</body>
</html>