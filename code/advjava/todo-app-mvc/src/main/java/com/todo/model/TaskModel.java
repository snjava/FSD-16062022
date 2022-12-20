package com.todo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.todo.dto.TaskBean;

public class TaskModel {

	
	public boolean save(TaskBean bean) {
		boolean result = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd16aug","root","root");
			PreparedStatement stmt = con.prepareStatement("INSERT INTO task(id,title,status,scheduledOn) values(0,?,?,?)");
				stmt.setString(1, bean.getTitle());
				stmt.setString(2, bean.getStatus());
				stmt.setString(3, bean.getScheduledOn());
			int cnt = stmt.executeUpdate();
			con.close();

			result = cnt>0;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
