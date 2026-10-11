package com.Practice_Day_38;

public class InPlaceRotation {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = a.length;

        // Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {

            int start = 0;
            int end = n - 1;

            while (start < end) {

                int temp = a[i][start];
                a[i][start] = a[i][end];
                a[i][end] = temp;

                start++;
                end--;
            }
        }

        for (int[] row : a) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
