package com.Practice_Day_40;

public class LastOccurrence {

    static int find(String s, int index, char target) {

        if (index < 0)
            return -1;

        if (s.charAt(index) == target)
            return index;

        return find(s, index - 1, target);
    }

    public static void main(String[] args) {
        System.out.println(find("banana", 5, 'a'));
    }
}