package com.bridgelabz.annotation.springbean;

public class address {
	private String city;
	private String state;
	private String country;

	public address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String toString() {
		return city + "," + state + "," + country;
	}
}
