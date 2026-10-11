package com.Practice_Day_31;

import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            System.out.println(ch + " = " + (int) ch);
        }
    }
}