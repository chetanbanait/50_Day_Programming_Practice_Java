package com.Practice_Day_48;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

public class File36CopyFile {
    public static void main(String[] args) throws IOException {
        Files.copy(Path.of("sample.txt"), Path.of("copy.txt"),
                   StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File copied");
    }
}