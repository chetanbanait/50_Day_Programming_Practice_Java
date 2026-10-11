package com.Practice_Day_48;

import java.io.FileWriter;
import java.io.IOException;

public class File34AppendData {
    public static void main(String[] args) throws IOException {
        try (FileWriter fw = new FileWriter("sample.txt", true)) {
            fw.write(System.lineSeparator() + "New appended line");
        }
        System.out.println("Data appended");
    }
}