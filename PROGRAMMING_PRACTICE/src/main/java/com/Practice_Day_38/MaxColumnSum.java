package com.Practice_Day_38;

public class MaxColumnSum {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {10, 5, 2},
            {4, 5, 6}
        };

        int max = 0;

        for (int j = 0; j < a[0].length; j++) {

            int sum = 0;

            for (int i = 0; i < a.length; i++)
                sum += a[i][j];

            if (sum > max)
                max = sum;
        }

        System.out.println("Maximum Column Sum = " + max);
    }
}