package com.Practice_Day_35;

class RunLengthEncoding {
    public static void main(String[] args) {

        String str = "AAABBCCCC";

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 1 &&
                str.charAt(i) == str.charAt(i + 1)) {

                count++;

            } else {

                System.out.print(str.charAt(i));
                System.out.print(count);

                count = 1;
            }
        }
    }
}
