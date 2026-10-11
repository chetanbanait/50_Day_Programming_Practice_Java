package com.Practice_Day_36;

class MatrixMinimum {
    public static void main(String[] args) {

        int[][] matrix = {
            {10, 20, 30},
            {40, 5, 60}
        };

        int min = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        System.out.println("Minimum = " + min);
    }
}