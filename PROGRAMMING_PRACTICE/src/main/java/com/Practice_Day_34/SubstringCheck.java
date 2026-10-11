package com.Practice_Day_34;

import java.util.Scanner;

class SubstringCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter substring: ");
        String s2 = sc.nextLine();

        if (s1.contains(s2))
            System.out.println("Substring");
        else
            System.out.println("Not Substring");
    }
}