package com.bridgelabz.annotation.springdi.constructor;

public class Student {

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
}
