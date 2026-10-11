package com.Practice_Day_31;

import java.util.Scanner;

public class UpperToLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.println(str.toLowerCase());
    }
}