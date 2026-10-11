package com.Practice_Day_36;

class MatrixAverage {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int sum = 0;
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                sum = sum + matrix[i][j];
                count++;
            }
        }

        double average = (double) sum / count;

        System.out.println("Average = " + average);
    }
}