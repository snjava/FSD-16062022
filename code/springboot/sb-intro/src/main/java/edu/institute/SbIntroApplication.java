package edu.institute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import edu.institute.model.TaskModel;

@SpringBootApplication
public class SbIntroApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SbIntroApplication.class, args);
		TaskModel model = ctx.getBean(TaskModel.class);
		model.save();
		model.update();
	}

}
