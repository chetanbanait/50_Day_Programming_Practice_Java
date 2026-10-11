package com.Practice_Day_35;

class IntegerToRoman {
    public static void main(String[] args) {

        int number = 58;

        int[] values = {1000, 900, 500, 400, 100,
                        90, 50, 40, 10, 9,
                        5, 4, 1};

        String[] symbols = {"M", "CM", "D", "CD", "C",
                            "XC", "L", "XL", "X", "IX",
                            "V", "IV", "I"};

        String result = "";

        for (int i = 0; i < values.length; i++) {

            while (number >= values[i]) {

                result = result + symbols[i];
                number = number - values[i];
            }
        }

        System.out.println(result);
    }
}
