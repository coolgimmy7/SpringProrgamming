package com.bridgelabz.annotation.springbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class Student {
	@Value(value = "ganu")
	private String name;

	public Student(String name) {
		this.name = name;
	}

	public Student() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("Hello: " + name);
	}

	@Bean
	public address stud() {

		return new address("mumbai", "mh", "india");
	}

//	@Bean
//	@Lazy(value = true)
//	public address stud2() {
//
//		return new address("pune", "mh", "india");
//	}
}
