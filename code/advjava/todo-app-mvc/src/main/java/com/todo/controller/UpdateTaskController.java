package com.todo.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.dto.TaskBean;
import com.todo.model.TaskModel;

@WebServlet("/modify-task")
public class UpdateTaskController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String status = request.getParameter("status");
		String id = request.getParameter("id");
		String date = request.getParameter("scheduledDt");
		
		TaskBean bean = new TaskBean();
			bean.setId(Integer.parseInt(id));
			bean.setTitle(title);
			bean.setScheduledOn(date);
			bean.setUpdatedOn(LocalDate.now().toString());
			bean.setStatus(status);
			
		TaskModel model = new TaskModel();
		boolean flag = model.updateTask(bean);
		
		String code = flag?"1":"0";
		
		request.setAttribute("taskDetails", bean);
		
		RequestDispatcher dis = request.getRequestDispatcher("edit-task.jsp?c="+code);
		dis.forward(request, response);
			
	}

}
