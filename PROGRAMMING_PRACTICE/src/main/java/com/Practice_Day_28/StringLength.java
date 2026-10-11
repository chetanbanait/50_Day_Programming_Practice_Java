package com.Practice_Day_28;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");

        String str = sc.nextLine();

        System.out.println("Length = " + str.length());
    }
}