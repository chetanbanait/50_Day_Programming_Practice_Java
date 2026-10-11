package com.Practice_Day_12;

public class TwinPrime {

    public static void main(String[] args) {

        for (int num = 2; num <= 100; num++) {

            int count1 = 0;
            int count2 = 0;

            for (int i = 1; i <= num; i++) {

                if (num % i == 0)
                    count1++;
            }

            for (int i = 1; i <= num + 2; i++) {

                if ((num + 2) % i == 0)
                    count2++;
            }

            if (count1 == 2 && count2 == 2) {

                System.out.println("(" + num + "," + (num + 2) + ")");
            }
        }
    }
}