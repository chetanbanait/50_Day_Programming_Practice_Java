package com.Practice_Day_3;

public class SimpleInterest {

	public static void main(String[] args) {

		double principal = 10000;
		double rate = 5;
		double time = 2;

		double simpleInterest = (principal * rate * time) / 100;

		System.out.println("Simple Interest = " + simpleInterest);
	}
}