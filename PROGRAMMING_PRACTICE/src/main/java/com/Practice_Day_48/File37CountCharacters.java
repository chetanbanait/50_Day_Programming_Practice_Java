package com.Practice_Day_48;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class File37CountCharacters {
    public static void main(String[] args) throws IOException {
        String data = Files.readString(Path.of("sample.txt"));
        System.out.println("Characters: " + data.length());
    }
}