package com.Practice_Day_48;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class File41ReplaceWord {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("sample.txt");
        String data = Files.readString(path);

        data = data.replace("Java", "Python");
        Files.writeString(path, data);

        System.out.println("Word replaced");
    }
}