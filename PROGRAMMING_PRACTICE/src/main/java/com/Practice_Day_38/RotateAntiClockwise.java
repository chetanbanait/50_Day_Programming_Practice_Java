package com.Practice_Day_38;

public class RotateAntiClockwise {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = a.length;

        for (int col = n - 1; col >= 0; col--) {
            for (int row = 0; row < n; row++) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }
    }
}
