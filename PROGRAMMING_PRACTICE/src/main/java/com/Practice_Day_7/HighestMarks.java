package com.Practice_Day_7;

import java.util.Scanner;

public class HighestMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first student marks: ");
        int marks1 = sc.nextInt();

        System.out.print("Enter second student marks: ");
        int marks2 = sc.nextInt();

        System.out.print("Enter third student marks: ");
        int marks3 = sc.nextInt();

        if (marks1 > marks2 && marks1 > marks3) {
            System.out.println("Highest Marks = " + marks1);
        } else if (marks2 > marks1 && marks2 > marks3) {
            System.out.println("Highest Marks = " + marks2);
        } else {
            System.out.println("Highest Marks = " + marks3);
        }
    }
}
