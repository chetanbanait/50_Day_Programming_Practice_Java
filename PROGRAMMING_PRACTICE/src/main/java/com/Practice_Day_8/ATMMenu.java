package com.Practice_Day_8;

import java.util.Scanner;

public class ATMMenu {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double balance = 10000;

		System.out.println("===== ATM MENU =====");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Exit");

		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();

		if (choice == 1) {

			System.out.println("Balance = " + balance);

		} else if (choice == 2) {

			System.out.print("Enter deposit amount: ");
			double amount = sc.nextDouble();

			balance = balance + amount;

			System.out.println("New Balance = " + balance);

		} else if (choice == 3) {

			System.out.print("Enter withdraw amount: ");
			double amount = sc.nextDouble();

			if (amount <= balance) {

				balance = balance - amount;

				System.out.println("Withdrawal Successful");
				System.out.println("Balance = " + balance);

			} else {

				System.out.println("Insufficient Balance");
			}

		} else if (choice == 4) {

			System.out.println("Thank You");

		} else {

			System.out.println("Invalid Choice");
		}
	}
}