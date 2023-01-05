package edu.institute.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bike {

	@Autowired
	@Qualifier("bikeEngine")
	Engine eng;
	
	public void bikeEngineDetails() {
		System.out.println("====Bike Engine Details======");
		eng.fualCapacity();
		eng.rpm();
	}
}
