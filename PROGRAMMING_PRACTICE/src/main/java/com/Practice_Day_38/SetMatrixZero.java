package com.Practice_Day_38;

public class SetMatrixZero {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        boolean[] row = new boolean[a.length];
        boolean[] col = new boolean[a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                if (a[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                if (row[i] || col[j])
                    a[i][j] = 0;

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}