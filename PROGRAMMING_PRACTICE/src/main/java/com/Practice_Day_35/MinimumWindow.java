package com.Practice_Day_35;

class MinimumWindow {
    public static void main(String[] args) {

        String str = "ADOBECODEBANC";
        String target = "ABC";

        String answer = "";

        for (int i = 0; i < str.length(); i++) {

            String temp = "";

            for (int j = i; j < str.length(); j++) {

                temp = temp + str.charAt(j);

                boolean found = true;

                for (int k = 0; k < target.length(); k++) {

                    char ch = target.charAt(k);

                    if (temp.indexOf(ch) == -1) {
                        found = false;
                        break;
                    }
                }

                if (found) {

                    if (answer.equals("") ||
                        temp.length() < answer.length()) {

                        answer = temp;
                    }

                    break;
                }
            }
        }

        System.out.println("Minimum window = " + answer);
    }
}
