package com.Practice_Day_6;

import java.util.Scanner;

public class CheckDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.println("Character is Digit");
        } else {
            System.out.println("Character is Not Digit");
        }
    }
}