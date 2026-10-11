package com.Practice_Day_48;

import java.io.FileWriter;
import java.io.IOException;

public class File42StudentRecords {
    public static void main(String[] args) throws IOException {
        try (FileWriter fw = new FileWriter("students.txt")) {
            fw.write("101,Chetan,85\n");
            fw.write("102,Rahul,90\n");
            fw.write("103,Neha,95\n");
        }
        System.out.println("Student records saved");
    }
}