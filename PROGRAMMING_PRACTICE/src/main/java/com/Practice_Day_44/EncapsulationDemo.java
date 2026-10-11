package com.Practice_Day_44;

class EncapsulationStudent {

	private String name;
	private int marks;

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}
}

public class EncapsulationDemo {
	public static void main(String[] args) {

		EncapsulationStudent s = new EncapsulationStudent();

		s.setName("Chetan");
		s.setMarks(90);

		System.out.println(s.getName());
		System.out.println(s.getMarks());
	}
}