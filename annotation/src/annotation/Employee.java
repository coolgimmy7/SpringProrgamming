package annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int identity;
	private String name;
	private Address address;

	public Employee() {
	}

	@Autowired
	public Employee(Address address) {
		this.address = address;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeart(Address add) {
		this.address = add;
	}

	public void startpump() {
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
