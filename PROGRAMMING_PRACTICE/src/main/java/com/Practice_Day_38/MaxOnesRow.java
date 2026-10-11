package com.Practice_Day_38;

public class MaxOnesRow {
    public static void main(String[] args) {

        int[][] a = {
            {0, 1, 1},
            {1, 1, 1},
            {0, 0, 1}
        };

        int max = 0;
        int row = -1;

        for (int i = 0; i < a.length; i++) {

            int count = 0;

            for (int j = 0; j < a[i].length; j++) {

                if (a[i][j] == 1)
                    count++;
            }

            if (count > max) {
                max = count;
                row = i;
            }
        }

        System.out.println("Row = " + row);
        System.out.println("Number of 1s = " + max);
    }
}
