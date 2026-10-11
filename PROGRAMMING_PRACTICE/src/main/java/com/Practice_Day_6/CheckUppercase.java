package com.Practice_Day_6;

import java.util.Scanner;

public class CheckUppercase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Character is Uppercase");
        } else {
            System.out.println("Character is Not Uppercase");
        }
    }
}