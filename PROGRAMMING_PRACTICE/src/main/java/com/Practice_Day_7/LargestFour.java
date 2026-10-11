package com.Practice_Day_7;

import java.util.Scanner;

public class LargestFour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();

        if (a > b && a > c && a > d) {
            System.out.println(a + " is Largest");
        } else if (b > a && b > c && b > d) {
            System.out.println(b + " is Largest");
        } else if (c > a && c > b && c > d) {
            System.out.println(c + " is Largest");
        } else {
            System.out.println(d + " is Largest");
        }
    }
}