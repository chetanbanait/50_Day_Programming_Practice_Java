package com.Practice_Day_48;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class File45CompareFiles {
    public static void main(String[] args) throws IOException {
        boolean same = Files.mismatch(
            Path.of("sample.txt"), Path.of("copy.txt")) == -1;

        System.out.println(same ? "Files are identical"
                                : "Files are different");
    }
}