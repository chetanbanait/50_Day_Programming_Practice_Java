package com.Practice_Day_42;

class ObjectCounter {

	static int count = 0;

	ObjectCounter() {
		count++;
	}
}

public class ObjectCounterDemo {
	public static void main(String[] args) {

		new ObjectCounter();
		new ObjectCounter();
		new ObjectCounter();
		new ObjectCounter();

		System.out.println("Objects Created: " + ObjectCounter.count);
	}
}