package edu.institute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import edu.institute.model.Bike;
import edu.institute.model.Car;
import edu.institute.model.Engine;

@SpringBootApplication
public class SbDiAutowireApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SbDiAutowireApplication.class, args);
	
		Car c = ctx.getBean(Car.class);
		c.carEngineDetails();
		
		Bike b = ctx.getBean(Bike.class);
		b.bikeEngineDetails();
	
	}
	
	@Bean("carEngine")
	@Primary
	public Engine getCarEngine() {
		Engine e = new Engine();
		e.rpm = 1500;
		e.fualCapacity = 2.5;
		return e;
	}
	
	@Bean("bikeEngine")
	public Engine getBikeEngine() {
		Engine e = new Engine();
		e.rpm = 800;
		e.fualCapacity = 1.2;
		return e;
	}
	

}
