<%@page import="com.todo.dto.TaskBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My All Task</title>
</head>
<body>
	<%@ include file="menu.jsp" %>

	<div align="center">
		<h1>View All Task</h1>
		<%
			ArrayList<TaskBean> list = (ArrayList<TaskBean>) request.getAttribute("tasks");
		%>
		
		<table  border="2">
			<thead>
				<tr>
					<th>Title</th>
					<th>Status</th>
					<th>Scheduled Date</th>
					<th>Updated Date</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<%
					for(TaskBean b : list) {	
				%>
					<tr>
						<td><%=b.getTitle()%></td>
						<td><%=b.getStatus()%></td>
						<td><%=b.getScheduledOn()%></td>
						<td><%=b.getUpdatedOn()%></td>
						<td>
							<a href="#">Edit</a> / <a href="#">Delete</a>
						</td>
					</tr>
				<% } %>
			</tbody>
		
		</table>
		
		
		
		
	</div>
	
</body>
</html>