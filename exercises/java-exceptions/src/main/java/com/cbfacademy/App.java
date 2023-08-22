package com.cbfacademy;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        FileExtension fileExtension = new FileExtension();
        HashMap<String, Integer> fileMap = new HashMap<>();

        List<String> fileNames = Arrays.asList("App.java", "App.txt", null, "App.md");
        Integer value = 0;

        for (String fileName: fileNames) {
            try {
                value = fileExtension.check(fileName);
            } catch (NullFilenameException e) {
                value = e.errorCode();
            }
            fileMap.put(fileName, value);
        }
        System.out.println(fileMap);
    }
}
