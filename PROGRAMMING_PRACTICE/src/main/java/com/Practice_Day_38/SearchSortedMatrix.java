package com.Practice_Day_38;

public class SearchSortedMatrix {
    public static void main(String[] args) {

        int[][] a = {
            {1, 4, 7},
            {8, 10, 12},
            {14, 16, 20}
        };

        int target = 10;
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                if (a[i][j] == target) {
                    found = true;
                    break;
                }
            }
        }

        if (found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}
