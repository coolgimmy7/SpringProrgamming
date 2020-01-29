package com.bridgelabz.annotation.springautowired.bytype;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.*;

@SuppressWarnings("deprecation")
public class Testusingresource {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/bridgelabz/annotation/springautowired/bytype/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		// autowired by type
		Employee emp2 = (Employee) factory.getBean("emp2");
		emp2.displayInfo();

	}
}
