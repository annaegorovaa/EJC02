package com.epam.streams.task3;

import java.io.*;

public class Utf {
    public static void main(String[] args) {
        try (Reader in = new InputStreamReader(new FileInputStream(args[0]), "UTF-8");
             Writer out = new OutputStreamWriter(new FileOutputStream("ConvertedToUTF16.txt"), "UTF-16")) {
            char buffer[] = new char[4096];
            int len;
            while ((len = in.read(buffer, 0, buffer.length)) != -1) {
                out.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
