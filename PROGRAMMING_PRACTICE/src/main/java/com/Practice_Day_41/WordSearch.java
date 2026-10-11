package com.Practice_Day_41;

public class WordSearch {

    static char[][] board = {
        {'A','B','C','E'},
        {'S','F','C','S'},
        {'A','D','E','E'}
    };

    static boolean search(int row, int col, String word, int index) {

        if (index == word.length())
            return true;

        if (row < 0 || col < 0 ||
            row >= board.length ||
            col >= board[0].length ||
            board[row][col] != word.charAt(index)) {

            return false;
        }

        char temp = board[row][col];
        board[row][col] = '#';

        boolean found =
            search(row + 1, col, word, index + 1) ||
            search(row - 1, col, word, index + 1) ||
            search(row, col + 1, word, index + 1) ||
            search(row, col - 1, word, index + 1);

        board[row][col] = temp;

        return found;
    }

    public static void main(String[] args) {

        String word = "ABCCED";
        boolean found = false;

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {

                if (search(i, j, word, 0))
                    found = true;
            }
        }

        System.out.println(found);
    }
}
