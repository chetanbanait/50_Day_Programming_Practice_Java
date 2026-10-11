package com.Practice_Day_40;

public class CountConsonants {

    static int count(String s, int index) {

        if (index == s.length())
            return 0;

        char ch = Character.toLowerCase(s.charAt(index));

        if (Character.isLetter(ch) &&
            !(ch == 'a' || ch == 'e' || ch == 'i' ||
              ch == 'o' || ch == 'u'))

            return 1 + count(s, index + 1);

        return count(s, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(count("Hello", 0));
    }
}
