package com.Practice_Day_32;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequencyHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
            else
                map.put(ch, 1);
        }

        System.out.println(map);
    }
}
