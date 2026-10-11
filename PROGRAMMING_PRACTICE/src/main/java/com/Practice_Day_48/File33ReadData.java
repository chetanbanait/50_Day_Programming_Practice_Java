package com.Practice_Day_48;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File33ReadData {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(
                new FileReader("sample.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}