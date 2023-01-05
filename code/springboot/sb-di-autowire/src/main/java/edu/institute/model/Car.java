package edu.institute.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired // DI injection happens automatically 
	Engine eng;
	
	public void carEngineDetails() {
		System.out.println("====Car Engine Details======");
		eng.fualCapacity();
		eng.rpm();
	}
	
}
