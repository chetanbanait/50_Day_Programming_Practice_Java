package com.Practice_Day_34;

class CompareFrequency {
    public static void main(String[] args) {

        String s1 = "aabbc";
        String s2 = "aabbc";

        int[] count1 = new int[256];
        int[] count2 = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            count2[s2.charAt(i)]++;
        }

        boolean same = true;

        for (int i = 0; i < 256; i++) {

            if (count1[i] != count2[i]) {
                same = false;
                break;
            }
        }

        System.out.println(same ? "Same Frequency" : "Different Frequency");
    }
}
