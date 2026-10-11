package com.Practice_Day_37;

class MatrixTranspose {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for (int j = 0; j < 3; j++) {

            for (int i = 0; i < 2; i++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}