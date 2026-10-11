package com.Practice_Day_38;

public class ReshapeMatrix {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2},
            {3, 4}
        };

        int rows = 1;
        int cols = 4;

        int[][] result = new int[rows][cols];

        int k = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                result[k / cols][k % cols] = a[i][j];
                k++;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(result[i][j] + " ");
        }
    }
}
