package com.Practice_Day_37;

class MainDiagonal {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {

            System.out.print(matrix[i][i] + " ");
        }
    }
}