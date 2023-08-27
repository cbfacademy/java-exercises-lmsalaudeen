package com.cbfacademy;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String path = "exercises/input-output/src/main/resources/exercise.txt";
        String newPath = "exercises/input-output/src/main/resources/new-nio-exercise.txt";
        String invertedPath = "exercises/input-output/src/main/resources/inverted.txt";
        // try (Stream<String> stream = Files.lines(Path.of(path))) {
        //     // stream.forEach(System.out::println);
        //     // Path copy = Paths.get(newPath);
        //     // Files.createFile(Path.of(newPath));
        //     Files.write(Path.of(newPath), (Iterable<String>)stream::iterator)
            
        // } catch (IOException e) {
        //     System.out.println("No file found");
        // }

        try {
            List<String> textList = Files.readAllLines(Path.of(path));
            Collections.reverse(textList);
            Files.write(Path.of(invertedPath), textList);

            // using an iterator
            ListIterator<String> textIterator = textList.listIterator(textList.size());
            while (textIterator.hasPrevious()) {
            //     writer.write(textIterator.previous());
            //     writer.newLine();
                System.out.println(textIterator.previous());
            }
            
        } catch (IOException e) {
            System.out.println("No file found");
        }
}
    }
