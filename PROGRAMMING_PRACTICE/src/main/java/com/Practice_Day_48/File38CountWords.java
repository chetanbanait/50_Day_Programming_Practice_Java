package com.Practice_Day_48;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class File38CountWords {
    public static void main(String[] args) throws IOException {
        String data = Files.readString(Path.of("sample.txt")).trim();

        int count = data.isEmpty() ? 0 : data.split("\\s+").length;
        System.out.println("Words: " + count);
    }
}
