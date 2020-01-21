
package com.bridgelabz.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.autowire.Results;

public class calcultionanswer {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Results results = (Results) context.getBean("results");
		System.out.println(results);
	}

}
