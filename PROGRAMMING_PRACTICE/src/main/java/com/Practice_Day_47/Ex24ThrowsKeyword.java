package com.Practice_Day_47;

import java.io.IOException;

public class Ex24ThrowsKeyword {
    static void checkFile() throws IOException {
        throw new IOException("File reading failed");
    }

    public static void main(String[] args) {
        try {
            checkFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}