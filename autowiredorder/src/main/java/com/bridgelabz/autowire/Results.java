package com.bridgelabz.autowire;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Results {

	@Autowired
	private List<calculation> cal;

	public String toString() {
		return cal.toString();
	}

}
