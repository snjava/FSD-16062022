package com.todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.dto.TaskBean;
import com.todo.model.TaskModel;

@WebServlet("/add-task")
public class CreateTaskController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String status = request.getParameter("status");
		String date = request.getParameter("scheduledDt");
		
		TaskBean bean = new TaskBean();
			bean.setTitle(title);
			bean.setStatus(status);
			bean.setScheduledOn(date);
			
		TaskModel model = new TaskModel();
		boolean flag = model.save(bean);
		
		String code = flag ? "1" : "0";
		
		response.sendRedirect("create-task.jsp?c="+code);
	}

}
