package com.todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.dto.TaskBean;
import com.todo.model.TaskModel;

@WebServlet("/edit-my-task")
public class EditTaskController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String taskId = request.getParameter("id");
		int id = Integer.parseInt(taskId);
		TaskModel model = new TaskModel();
		TaskBean task = model.getTaskById(id);
		
		request.setAttribute("taskDetails", task);
		
		RequestDispatcher dis = request.getRequestDispatcher("edit-task.jsp");
		dis.forward(request, response);
		
		
	}

}
