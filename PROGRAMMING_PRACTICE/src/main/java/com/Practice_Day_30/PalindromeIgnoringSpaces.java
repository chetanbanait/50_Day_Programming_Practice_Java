package com.Practice_Day_30;
import java.util.Scanner;

public class PalindromeIgnoringSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine().replace(" ", "").toLowerCase();

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}