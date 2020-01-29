package com.bridgelabz.annotation.springdi.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// Resource resource = new ClassPathResource("applicationContext.xml");
		// BeanFactory factory = new XmlBeanFactory(resource);
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/bridgelabz/annotation/springdi/property/springDiproparty.xml");

		// using property
		Student student2 = (Student) factory.getBean("stud1");
		student2.displayInfo();

	}
}
