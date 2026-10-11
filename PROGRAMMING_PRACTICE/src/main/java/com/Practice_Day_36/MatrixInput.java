package com.Practice_Day_36;

import java.util.Scanner;

class MatrixInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[2][3];

        System.out.println("Enter elements:");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }
    }
}