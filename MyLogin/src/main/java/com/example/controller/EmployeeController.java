package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;

@RestController
public class EmployeeController {

	@RequestMapping("/logout")
	public String logoutemp() {
		return "logout successfull....";
	}

	@RequestMapping("/login")
	public static String log() {

		return "next";
	}

	@RequestMapping("/success/")
	public String loginsuccess() {

		return "login successfull....";
	}

	@RequestMapping("/register")
	public String registerNewuser() {
		List<Employee> list = new ArrayList<Employee>();
		Employee e = new Employee();
		e.setFirstName("ganesh");
		e.setEmail("ganesh@gmail.com");
		e.setId(1);
		e.setLastName("asgdfhk");
		list.add(e);
		return "welcome " + e.getFirstName();
	}

}
