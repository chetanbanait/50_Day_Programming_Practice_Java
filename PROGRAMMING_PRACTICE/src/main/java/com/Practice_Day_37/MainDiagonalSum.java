package com.Practice_Day_37;

class MainDiagonalSum {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {

            sum = sum + matrix[i][i];
        }

        System.out.println("Main diagonal sum = " + sum);
    }
}