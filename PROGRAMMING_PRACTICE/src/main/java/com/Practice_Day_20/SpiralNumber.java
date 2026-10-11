package com.Practice_Day_20;

public class SpiralNumber {

    public static void main(String[] args) {

        int n = 5;
        int[][] a = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        int num = 1;

        while (true) {

            if (left > right)
                break;

            for (int i = left; i <= right; i++)
                a[top][i] = num++;

            top++;

            if (top > bottom)
                break;

            for (int i = top; i <= bottom; i++)
                a[i][right] = num++;

            right--;

            if (left > right)
                break;

            for (int i = right; i >= left; i--)
                a[bottom][i] = num++;

            bottom--;

            if (top > bottom)
                break;

            for (int i = bottom; i >= top; i--)
                a[i][left] = num++;

            left++;
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++)
                System.out.printf("%3d", a[i][j]);

            System.out.println();
        }
    }
}