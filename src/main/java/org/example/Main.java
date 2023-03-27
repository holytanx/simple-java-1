package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String name = "John Doe";

        // BAD: Unnecessary call to 'toString' on 'name'
        System.out.println("Hi, my name is " + name.toString());

        long data;

        BufferedReader readerBuffered = new BufferedReader(
                new InputStreamReader(System.in, "UTF-8"));
        String stringNumber = readerBuffered.readLine();
        if (stringNumber != null) {
            data = Long.parseLong(stringNumber.trim());
        } else {
            data = 0;
        }

        // AVOID: potential truncation if input data is very large,
        // for example 'Long.MAX_VALUE'
        int scaled = (int)data;
    }
}