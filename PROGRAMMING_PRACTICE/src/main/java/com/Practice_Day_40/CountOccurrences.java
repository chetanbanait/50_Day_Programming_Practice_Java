package com.Practice_Day_40;

public class CountOccurrences {

    static int count(int[] a, int index, int target) {

        if (index == a.length)
            return 0;

        if (a[index] == target)
            return 1 + count(a, index + 1, target);

        return count(a, index + 1, target);
    }

    public static void main(String[] args) {

        int[] a = {10, 20, 10, 30, 10, 40};

        int target = 10;

        System.out.println("Occurrences = " +
                           count(a, 0, target));
    }
}