package com.Practice_Day_6;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 35) {
            System.out.println("Student is Pass");
        } else {
            System.out.println("Student is Fail");
        }
    }
}