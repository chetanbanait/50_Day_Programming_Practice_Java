package com.Practice_Day_36;

import java.util.Scanner;

class SearchMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == search) {

                    System.out.println(
                        "Element found at row " + i +
                        ", column " + j
                    );

                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}