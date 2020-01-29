package com.bridgelabz.annotation.springautowired.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private int identity;
	private String name;
	private Address address;

	public Employee() {
	}

	@Autowired
	public Employee(@Qualifier("add1") Address address) {
		this.address = address;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		if (address != null) {
			// if @Autowired is written
			System.out.println(identity + " " + name);
			System.out.println(address.toString());
		} else {// if @Autowired not written
			System.out.println(identity + " " + name);
			System.out.println("address null");
		}
	}

}
