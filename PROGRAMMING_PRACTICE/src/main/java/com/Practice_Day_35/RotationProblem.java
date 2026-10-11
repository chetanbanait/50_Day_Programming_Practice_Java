package com.Practice_Day_35;

class RotationProblem {
    public static void main(String[] args) {

        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        if (s1.length() == s2.length() &&
            (s1 + s1).contains(s2)) {

            System.out.println("Rotation");
        } else {
            System.out.println("Not Rotation");
        }
    }
}