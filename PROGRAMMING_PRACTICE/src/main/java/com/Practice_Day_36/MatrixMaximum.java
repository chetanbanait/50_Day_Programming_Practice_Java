package com.Practice_Day_36;

class MatrixMaximum {
    public static void main(String[] args) {

        int[][] matrix = {
            {10, 20, 30},
            {40, 5, 60}
        };

        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Maximum = " + max);
    }
}
