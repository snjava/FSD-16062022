package com.todo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.todo.dto.TaskBean;import jdk.jshell.spi.ExecutionControl.ExecutionControlException;

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
	
	
	public ArrayList<TaskBean> getAllTask() {
		ArrayList<TaskBean> list = new ArrayList<TaskBean>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd16aug","root","root");
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM task");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				TaskBean bean = new TaskBean();
				bean.setId(rs.getInt("id"));
				bean.setTitle(rs.getString("title"));
				bean.setStatus(rs.getString("status"));
				bean.setScheduledOn(rs.getString("scheduledOn"));
				bean.setUpdatedOn(rs.getString("updatedOn"));
				list.add(bean);
			}
			con.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}
	
	public TaskBean getTaskById(int id) {
		TaskBean bean = new TaskBean();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd16aug","root","root");
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM task WHERE id=?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				bean.setId(rs.getInt("id"));
				bean.setTitle(rs.getString("title"));
				bean.setStatus(rs.getString("status"));
				bean.setScheduledOn(rs.getString("scheduledOn"));
				bean.setUpdatedOn(rs.getString("updatedOn"));
			}
			con.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return bean;
	}
	
	public boolean updateTask(TaskBean bean) {
		boolean result = false;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd16aug","root","root");
			PreparedStatement stmt = con.prepareStatement("UPDATE task SET title=?, status=?, scheduledOn=?, updatedOn=? WHERE id=?");
				stmt.setString(1, bean.getTitle());
				stmt.setString(2, bean.getStatus());
				stmt.setString(3, bean.getScheduledOn());
				stmt.setString(4, bean.getUpdatedOn());
				stmt.setInt(5, bean.getId());
			int cnt = stmt.executeUpdate();
			con.close();
			result = cnt>0;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
