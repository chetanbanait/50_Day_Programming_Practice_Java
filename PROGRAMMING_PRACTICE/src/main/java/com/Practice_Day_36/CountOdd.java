package com.Practice_Day_36;

class CountOdd {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int count = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] % 2 != 0) {
                    count++;
                }
            }
        }

        System.out.println("Odd elements = " + count);
    }
}