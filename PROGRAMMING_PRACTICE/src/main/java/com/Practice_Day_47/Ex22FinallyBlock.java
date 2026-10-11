package com.Practice_Day_47;

public class Ex22FinallyBlock {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error occurred");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}