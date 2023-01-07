package edu.institute.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.institute.bean.Product;

@RestController // You can define the class as a rest controller which will have a REST API
public class WelcomeController {

	@GetMapping("/welcome-msg")
	public String welcomeMessage() {
		return "Welcome To First REST API using Spring Boot";
	}
	
	@GetMapping("/welcome-msgs")
	public String[] welcomeMessages() {
		String[] messages = {"Hello", "Good Morning", "Welcome"}; 
		return messages;
	}
	
	@GetMapping("/get-product")
	public Product getProductDetails() {
		Product p = new Product();
		p.setId(123);
		p.setName("Smart Watch");
		p.setPrice(25645.3);
		return p;
	}
	
	@GetMapping("/get-products")
	public List<Product> getProductsDetails() {
		Product p1 = new Product();
		p1.setId(123);
		p1.setName("Smart Watch");
		p1.setPrice(25645.3);
		
		Product p2 = new Product();
		p2.setId(321);
		p2.setName("Smart TV");
		p2.setPrice(45332.1);
		
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(p1);
		list.add(p2);
		
		return list;
	}
	
	
}
