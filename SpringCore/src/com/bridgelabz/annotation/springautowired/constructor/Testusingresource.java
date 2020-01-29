package com.bridgelabz.annotation.springautowired.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.*;

@SuppressWarnings("deprecation")
public class Testusingresource {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/bridgelabz/annotation/springautowired/constructor/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		// autowired by constructor
		Employee emp3 = (Employee) factory.getBean("emp3");
		emp3.displayInfo();

	}
}
