package com.Practice_Day_47;

public class Ex18ArrayIndexException {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
    }
}