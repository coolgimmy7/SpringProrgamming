package demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.*;

@SuppressWarnings("deprecation")
public class Testusingresource {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		// autowired by name
		Employee emp = (Employee) factory.getBean("emp1");
		emp.displayInfo();

		// autowired by type
		Employee emp2 = (Employee) factory.getBean("emp2");
		emp2.displayInfo();

		// autowired by constructor
		Employee emp3 = (Employee) factory.getBean("emp3");
		emp3.displayInfo();

	}
}
