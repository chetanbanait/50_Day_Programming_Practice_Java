package com.Practice_Day_47;

public class Ex20MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20};
            int result = arr[5] / 0;
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } catch (Exception e) {
            System.out.println("General error");
        }
    }
}