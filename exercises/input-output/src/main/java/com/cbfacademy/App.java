package com.cbfacademy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String path = "exercises/input-output/src/main/resources/exercise.txt";
        String newPath = "exercises/input-output/src/main/resources/new-exercise.txt";

        try (
            FileInputStream fileInputStream = new FileInputStream(path);
            InputStreamReader streamReader = new InputStreamReader(fileInputStream);
            LineNumberReader lineReader = new LineNumberReader(streamReader);

            FileOutputStream fileOutputStream = new FileOutputStream(newPath);
            OutputStreamWriter streamWriter = new OutputStreamWriter(fileOutputStream);
            PrintWriter writer = new PrintWriter(streamWriter);
        ) { 
            String outputLine = lineReader.readLine();
            while (outputLine != null) {
                // System.out.println(outputLine);
                writer.println(outputLine);
                outputLine = lineReader.readLine();
            } 
            writer.close();
            streamWriter.close();
            fileOutputStream.close();

        } catch (IOException e) {
            System.out.println("No file found");
        }
    }
}
