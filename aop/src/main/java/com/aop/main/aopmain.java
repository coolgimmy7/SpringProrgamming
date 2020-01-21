package com.aop.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.EmployeeService;

public class aopmain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);

		System.out.println(employeeService.getEmployee().getName());

		employeeService.getEmployee().setName("ganesh");

		context.close();
	}

}
