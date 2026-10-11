package com.Practice_Day_48;

import java.io.FileWriter;
import java.io.IOException;

public class File32WriteData {
    public static void main(String[] args) throws IOException {
        try (FileWriter fw = new FileWriter("sample.txt")) {
            fw.write("Hello Java File Handling");
        }
        System.out.println("Data written");
    }
}