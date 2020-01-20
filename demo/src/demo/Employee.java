package demo;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private address address;

	public void setAddress(address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(int id, String name, address address) {

		this.id = id;
		this.name = name;
		this.address = address;
	}

	void displayInfo() {
		 System.out.println(id + " " + name);
		System.out.println(address.toString());

	}
}