package com.Practice_Day_8;

import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase Character");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase Character");
        } else {
            System.out.println("Not an Alphabet");
        }
    }
}