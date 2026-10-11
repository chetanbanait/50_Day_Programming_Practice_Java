package com.Practice_Day_48;

import java.io.FileWriter;
import java.io.IOException;

public class File43EmployeeRecords {
    public static void main(String[] args) throws IOException {
        try (FileWriter fw = new FileWriter("employees.txt")) {
            fw.write("1,Amit,30000\n");
            fw.write("2,Neha,45000\n");
            fw.write("3,Rahul,40000\n");
        }
        System.out.println("Employee records saved");
    }
}