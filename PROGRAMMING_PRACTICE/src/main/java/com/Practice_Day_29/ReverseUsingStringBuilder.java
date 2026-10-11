package com.Practice_Day_29;

import java.util.Scanner;

public class ReverseUsingStringBuilder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        System.out.println("Reverse = " + sb.reverse());
    }
}