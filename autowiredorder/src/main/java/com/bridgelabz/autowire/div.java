package com.bridgelabz.autowire;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order
public class div implements calculation {
	private int number1 = 4;
	private int number2 = 2;

	@Override
	public String toString() {
		return "div: " + String.valueOf(this.number1 / this.number2);
	}
}
