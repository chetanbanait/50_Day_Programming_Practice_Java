package com.Practice_Day_4;

import java.util.Scanner;

public class AcceptCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Character: ");
		char character = sc.next().charAt(0);

		System.out.println("Entered Character = " + character);

		sc.close();
	}
}