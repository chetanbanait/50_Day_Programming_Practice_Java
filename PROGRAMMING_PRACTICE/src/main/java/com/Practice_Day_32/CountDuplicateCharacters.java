package com.Practice_Day_32;

import java.util.Scanner;

public class CountDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int countDuplicate = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i)) != i)
                continue;

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j))
                    count++;
            }

            if (count > 1)
                countDuplicate++;
        }

        System.out.println("Duplicate characters = " +
                           countDuplicate);
    }
}