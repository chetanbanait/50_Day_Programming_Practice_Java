package com.Practice_Day_29;

import java.util.Scanner;

public class ReverseOnlyVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (!isVowel(arr[left])) {
                left++;
            }

            else if (!isVowel(arr[right])) {
                right--;
            }

            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println(new String(arr));
    }

    static boolean isVowel(char ch) {

        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }
}
