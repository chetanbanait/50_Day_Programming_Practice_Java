package com.Practice_Day_37;

class IdentityMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        boolean identity = true;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (i == j && matrix[i][j] != 1) {
                    identity = false;
                }

                if (i != j && matrix[i][j] != 0) {
                    identity = false;
                }
            }
        }

        if (identity)
            System.out.println("Identity Matrix");
        else
            System.out.println("Not Identity Matrix");
    }
}