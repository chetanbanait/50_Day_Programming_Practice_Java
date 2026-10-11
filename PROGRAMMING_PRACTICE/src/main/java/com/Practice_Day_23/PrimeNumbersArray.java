package com.Practice_Day_23;

public class PrimeNumbersArray {

    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 6, 7, 9, 11, 15};

        System.out.println("Prime Numbers:");

        for (int num : arr) {

            if (num < 2)
                continue;

            boolean prime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {

                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime)
                System.out.print(num + " ");
        }
    }
}