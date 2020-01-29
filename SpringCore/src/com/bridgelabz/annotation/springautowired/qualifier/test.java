package com.bridgelabz.annotation.springautowired.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabz/annotation/springautowired/qualifier/applicationContext.xml");
		// annotation
		Employee person = (Employee) context.getBean("emp1");
		person.show();
	}
}
