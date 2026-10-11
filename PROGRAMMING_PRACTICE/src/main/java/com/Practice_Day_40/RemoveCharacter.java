package com.Practice_Day_40;

public class RemoveCharacter {

    static String remove(String s, int index, char target) {

        if (index == s.length())
            return "";

        char ch = s.charAt(index);

        if (ch == target)
            return remove(s, index + 1, target);

        return ch + remove(s, index + 1, target);
    }

    public static void main(String[] args) {
        System.out.println(remove("banana", 0, 'a'));
    }
}
