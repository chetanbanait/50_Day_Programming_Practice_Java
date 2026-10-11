package com.Practice_Day_4;

import java.util.Scanner;

public class AcceptTemperature {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Temperature: ");
		double temperature = sc.nextDouble();

		System.out.println("Temperature = " + temperature + "°C");

		sc.close();
	}
}