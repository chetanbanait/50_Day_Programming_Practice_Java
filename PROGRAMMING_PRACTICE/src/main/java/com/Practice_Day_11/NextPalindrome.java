package com.Practice_Day_11;

import java.util.Scanner;

public class NextPalindrome {

	static boolean isPalindrome(int n) {

		int temp = n;
		int rev = 0;

		while (n > 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}

		return temp == rev;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		num++;

		while (!isPalindrome(num))
			num++;

		System.out.println(num);
	}
}