package com.Practice_Day_48;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class File39CountLines {
    public static void main(String[] args) throws IOException {
        long count = Files.lines(Path.of("sample.txt")).count();
        System.out.println("Lines: " + count);
    }
}