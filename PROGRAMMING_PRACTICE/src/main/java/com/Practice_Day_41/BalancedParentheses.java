package com.Practice_Day_41;

public class BalancedParentheses {

    static void generate(int open, int close, String result) {

        if (open == 0 && close == 0) {
            System.out.println(result);
            return;
        }

        if (open > 0) {
            generate(open - 1, close, result + "(");
        }

        if (close > open) {
            generate(open, close - 1, result + ")");
        }
    }

    public static void main(String[] args) {
        generate(3, 3, "");
    }
}
