package com.Practice_Day_48;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class File44ReadCSV {
    public static void main(String[] args) throws IOException {
        for (String line : Files.readAllLines(Path.of("students.csv"))) {
            String[] values = line.split(",");
            for (String value : values) {
                System.out.print(value.trim() + " | ");
            }
            System.out.println();
        }
    }
}