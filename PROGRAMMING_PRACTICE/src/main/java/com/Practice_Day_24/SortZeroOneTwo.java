package com.Practice_Day_24;

public class SortZeroOneTwo {
    public static void main(String[] args) {

        int[] a = {2, 0, 1, 2, 1, 0, 2};

        int zero = 0;
        int one = 0;
        int two = 0;

        for (int x : a) {

            if (x == 0)
                zero++;
            else if (x == 1)
                one++;
            else
                two++;
        }

        int index = 0;

        while (zero-- > 0)
            a[index++] = 0;

        while (one-- > 0)
            a[index++] = 1;

        while (two-- > 0)
            a[index++] = 2;

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}