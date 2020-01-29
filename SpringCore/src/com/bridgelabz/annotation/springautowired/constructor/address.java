package com.bridgelabz.annotation.springautowired.constructor;

public class address {
	private String city;
	private String state;
	private String country;

	public address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String toString() {
		return city + "," + state + "," + country;
	}
}
