package com.Practice_Day_41;

public class NQueens {

    static int n = 4;
    static int[][] board = new int[n][n];

    static boolean isSafe(int row, int col) {

        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1)
                return false;
        }

        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 1)
                return false;
        }

        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n; i--, j++) {

            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    static boolean solve(int row) {

        if (row == n)
            return true;

        for (int col = 0; col < n; col++) {

            if (isSafe(row, col)) {

                board[row][col] = 1;

                if (solve(row + 1))
                    return true;

                board[row][col] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        solve(0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
