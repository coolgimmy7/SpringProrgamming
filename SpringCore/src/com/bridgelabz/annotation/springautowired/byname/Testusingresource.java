package com.bridgelabz.annotation.springautowired.byname;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.*;

@SuppressWarnings("deprecation")
public class Testusingresource {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/bridgelabz/annotation/springautowired/byname/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		// autowired by name
		Employee emp = (Employee) factory.getBean("emp1");
		emp.displayInfo();

	}
}
