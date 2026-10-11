package com.Practice_Day_38;

public class BoundaryElements {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = a.length;
        int cols = a[0].length;

        for (int j = 0; j < cols; j++)
            System.out.print(a[0][j] + " ");

        for (int i = 1; i < rows; i++)
            System.out.print(a[i][cols - 1] + " ");

        for (int j = cols - 2; j >= 0; j--)
            System.out.print(a[rows - 1][j] + " ");

        for (int i = rows - 2; i > 0; i--)
            System.out.print(a[i][0] + " ");
    }
}