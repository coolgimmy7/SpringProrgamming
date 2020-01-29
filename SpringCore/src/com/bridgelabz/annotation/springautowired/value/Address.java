package com.bridgelabz.annotation.springautowired.value;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	@Value(value = "pune") // final value(fixed)
	private String city;
//	@Value(value = "mh") 
	private String state;
	@Value(value = "japan")
	private String country;

	public Address(String state, String country) {
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}

	public void pump() {
		System.out.println("u r alive");
	}
}
