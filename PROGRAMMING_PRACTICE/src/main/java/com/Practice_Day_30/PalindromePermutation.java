package com.Practice_Day_30;
import java.util.Scanner;

public class PalindromePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine().toLowerCase();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ')
                freq[ch]++;
        }

        int oddCount = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
            }
        }

        if (oddCount <= 1)
            System.out.println("Palindrome permutation possible");
        else
            System.out.println("Palindrome permutation not possible");
    }
}