<%@page import="com.todo.dto.TaskBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Task</title>
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
						msg = "Your Task been Edited successfully.....";
						color= "green";
						break;
					case "0":
						msg = "Your Task Updation failed. Please try again.!!";
						color= "red";
						break;
				}
			}
		%>
		
		<h3 style="color: <%=color%>"> <%=msg %></h3>
		
		<% TaskBean b = (TaskBean)request.getAttribute("taskDetails"); %>
		
		<form action="modify-task">
			Title : <input type="text" name="title" value="<%=b.getTitle()%>">
			<br><br>
			Status : 
				<select name="status">
					<option value="Open">Open</option>
					<option value="Inprogress">Inprogress</option>
					<option value="Close">Close</option>
				</select>
			<br><br>
			Schedule Date : <input type="date" name="scheduledDt" value="<%=b.getScheduledOn()%>">
			<br><br>
			<button type="submit">Update Task</button>
		
			<input type="hidden" name="id" value="<%=b.getId()%>">
		
		</form>
	</div>

</body>
</html>