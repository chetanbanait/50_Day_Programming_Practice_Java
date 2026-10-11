package com.Practice_Day_35;

class CharacterReplacement {
    public static void main(String[] args) {

        String str = "AABABBA";

        int k = 1;
        int maxLength = 0;

        for (int i = 0; i < str.length(); i++) {

            int[] count = new int[26];
            int maxFrequency = 0;

            for (int j = i; j < str.length(); j++) {

                int index = str.charAt(j) - 'A';

                count[index]++;

                maxFrequency = Math.max(maxFrequency, count[index]);

                int window = j - i + 1;

                if (window - maxFrequency <= k) {
                    maxLength = Math.max(maxLength, window);
                }
            }
        }

        System.out.println("Longest length = " + maxLength);
    }
}