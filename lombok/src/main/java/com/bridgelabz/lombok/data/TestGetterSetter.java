package com.bridgelabz.lombok.data;

public class TestGetterSetter {
	public static void main(String[] args) {
		Employee employee2 = new Employee();
		employee2.setId(11);
		employee2.setName("john");

		System.out.println(employee2.getId() + " " + employee2.getName());

	}
}
