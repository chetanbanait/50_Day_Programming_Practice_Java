package com.Practice_Day_38;

public class SaddlePoint {
    public static void main(String[] args) {

        int[][] a = {
            {3, 4, 5},
            {2, 1, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < a.length; i++) {

            int min = a[i][0];
            int col = 0;

            for (int j = 1; j < a[i].length; j++) {

                if (a[i][j] < min) {
                    min = a[i][j];
                    col = j;
                }
            }

            boolean saddle = true;

            for (int k = 0; k < a.length; k++) {

                if (a[k][col] > min) {
                    saddle = false;
                    break;
                }
            }

            if (saddle)
                System.out.println("Saddle Point = " + min);
        }
    }
}