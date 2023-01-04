package edu.institute.model;

import org.springframework.stereotype.Component;

@Component
public class TaskModel {
	public TaskModel() {
		System.out.println("Task Model Object is created..");
	}
	
	public void save() {
		System.out.println("This is the save method from the model class");
	}
	
	public void update() {
		System.out.println("This is the update method from the model class");
	}
}
