package com.tosin.hive.azkaban;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AzkabanTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("/opt/module/azkaban/output.txt");
        fileOutputStream.write("this ia a java progress".getBytes());
        fileOutputStream.close();
    }
}
