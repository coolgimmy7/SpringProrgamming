package com.bridgelabz.annotation.springautowired.value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationmain {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabz/annotation/springautowired/value/applicationContextautowired.xml");
		Employee person = (Employee) context.getBean("emp");
		person.show();

	}
}
