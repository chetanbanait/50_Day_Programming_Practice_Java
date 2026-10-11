package com.Practice_Day_7;

import java.util.Scanner;

public class CompareAges {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first person age: ");
        int age1 = sc.nextInt();

        System.out.print("Enter second person age: ");
        int age2 = sc.nextInt();

        if (age1 > age2) {
            System.out.println("First person is Older");
        } else if (age2 > age1) {
            System.out.println("Second person is Older");
        } else {
            System.out.println("Both have Same Age");
        }
    }
}