package com.Practice_Day_48;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class File40SearchWord {
    public static void main(String[] args) throws IOException {
        String data = Files.readString(Path.of("sample.txt"));

        if (data.contains("Java")) {
            System.out.println("Word found");
        } else {
            System.out.println("Word not found");
        }
    }
}
