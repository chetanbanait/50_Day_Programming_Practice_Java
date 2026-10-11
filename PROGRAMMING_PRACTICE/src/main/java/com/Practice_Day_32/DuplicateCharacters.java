package com.Practice_Day_32;

import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted)
                continue;

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }

            if (count > 1)
                System.out.println(str.charAt(i));
        }
    }
}