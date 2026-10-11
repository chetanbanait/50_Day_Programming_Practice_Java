package com.Practice_Day_11;

import java.util.Scanner;

public class BinaryPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String binary = Integer.toBinaryString(num);

        String reverse = "";

        for (int i = binary.length() - 1; i >= 0; i--)
            reverse += binary.charAt(i);

        if (binary.equals(reverse))
            System.out.println("Binary Palindrome");
        else
            System.out.println("Not Binary Palindrome");
    }
}
