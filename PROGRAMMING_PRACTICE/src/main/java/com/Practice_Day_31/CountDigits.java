package com.Practice_Day_31;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }

        System.out.println("Digits = " + count);
    }
}
