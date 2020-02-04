package com.bridgelabz.lombok.val;

import lombok.val;

import java.util.ArrayList;

public class ValExample {

	ArrayList<String> extractFirstInLower(ArrayList<String> list) {
		list.add("Hello, guys!");
		list.add("how are you!");
		list.add("Have a nice day!");
		val data= list;
		return data;
	}

	public static void main(String[] args) {
		val myList = new ArrayList<String>();
		val valExampleObj = new ValExample();
		val result = valExampleObj.extractFirstInLower(myList);
		System.out.println("result : " + result);
	}
}
