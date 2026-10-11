package com.Practice_Day_41;

public class RatMaze {

    static int[][] maze = {
        {1, 0, 0, 0},
        {1, 1, 0, 1},
        {0, 1, 0, 0},
        {1, 1, 1, 1}
    };

    static int n = 4;

    static boolean solve(int row, int col) {

        if (row == n - 1 && col == n - 1)
            return true;

        if (row >= 0 && col >= 0 &&
            row < n && col < n &&
            maze[row][col] == 1) {

            maze[row][col] = 2;

            if (solve(row + 1, col))
                return true;

            if (solve(row, col + 1))
                return true;

            if (solve(row - 1, col))
                return true;

            if (solve(row, col - 1))
                return true;

            maze[row][col] = 1;
        }

        return false;
    }

    public static void main(String[] args) {

        solve(0, 0);

        for (int[] row : maze) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}