package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class BasicFileOperations  {
    public static void main(String[] args) {

    }
    String path="C:\\Users\\Qapitol QA\\Downloads\\htd.txt";
    File file=new File(path);

   BufferedWriter bw;

    {
        try {
            bw = new BufferedWriter(new FileWriter(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
