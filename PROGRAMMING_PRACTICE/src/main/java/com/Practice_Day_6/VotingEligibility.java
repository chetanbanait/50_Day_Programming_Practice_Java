package com.Practice_Day_6;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are Eligible for Voting");
        } else {
            System.out.println("You are Not Eligible for Voting");
        }
    }
}