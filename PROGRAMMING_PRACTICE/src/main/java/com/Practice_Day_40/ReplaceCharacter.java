package com.Practice_Day_40;

public class ReplaceCharacter {

    static String replace(String s, int index, char oldChar, char newChar) {

        if (index == s.length())
            return "";

        char ch = s.charAt(index);

        if (ch == oldChar)
            ch = newChar;

        return ch + replace(s, index + 1, oldChar, newChar);
    }

    public static void main(String[] args) {
        System.out.println(replace("banana", 0, 'a', 'x'));
    }
}
