package com.Practice_Day_38;

public class RotateClockwise {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = a.length;

        for (int col = 0; col < n; col++) {
            for (int row = n - 1; row >= 0; row--) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }
    }
}