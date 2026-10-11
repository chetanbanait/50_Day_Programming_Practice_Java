package com.Practice_Day_38;

public class ToeplitzMatrix {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {4, 1, 2},
            {5, 4, 1}
        };

        boolean result = true;

        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[i].length; j++) {

                if (a[i][j] != a[i - 1][j - 1]) {
                    result = false;
                    break;
                }
            }
        }

        if (result)
            System.out.println("Toeplitz Matrix");
        else
            System.out.println("Not Toeplitz Matrix");
    }
}
