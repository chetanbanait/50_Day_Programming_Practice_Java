package com.Practice_Day_35;

import java.util.*;

class BalancedBrackets {
    public static void main(String[] args) {

        String str = "[{()}]";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {

                if (stack.isEmpty()) {
                    System.out.println("Not Balanced");
                    return;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {

                    System.out.println("Not Balanced");
                    return;
                }
            }
        }

        if (stack.isEmpty())
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}