package com.bridgelabz.scope.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.scope.property.services.CustomerService;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "Spring-CustomerPrototype.xml" });

		CustomerService obj1 = (CustomerService) context.getBean("customerService");
		obj1.setMessage("first object ");
		System.out.println("Message : " + obj1.getMessage());

		// call again
		CustomerService obj2 = (CustomerService) context.getBean("customerService");
		System.out.println("Message : " + obj2.getMessage());
	}
}
