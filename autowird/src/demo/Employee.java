package demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int id;
	private String name;
	private address address = null;

	public Employee() {
	}

	// @Autowired
	public Employee(int id, String name, demo.address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(address address) {
		this.address = address;
	}

	void displayInfo() {
		System.out.println(id + " " + name);
		if (address != null) {
			System.out.println(address.toString());
		} else {

		}
	}
}