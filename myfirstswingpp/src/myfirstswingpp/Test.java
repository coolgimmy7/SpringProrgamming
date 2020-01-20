package myfirstswingpp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		// Resource resource = new ClassPathResource("applicationContext.xml");
		// BeanFactory factory = new XmlBeanFactory(resource);
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

		// using getter-setter
		Student student = (Student) factory.getBean("stud1");
		student.displayInfo();

		// using constructor
		Student student2 = (Student) factory.getBean("stud2");
		student2.displayInfo();

	}
}
