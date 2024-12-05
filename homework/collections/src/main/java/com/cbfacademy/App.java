package com.cbfacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // removeSmallInts test
        List<Integer> someNumbers = new LinkedList<Integer>();
        Collections.addAll(someNumbers, 1,2,3,4,6,6);

        System.out.println(someNumbers);
        CollectionsAssignment.removeSmallInts(someNumbers, 3);
        System.out.println(someNumbers); 


        // containsDuplicates test
        System.out.println(CollectionsAssignment.containsDuplicates(someNumbers));

        // inEither test
        List<Integer> num1 = new LinkedList<Integer>();
        List<Integer> num2 = new LinkedList<Integer>();
        Collections.addAll(num1, 5, 2, 1, 2, 3);
        Collections.addAll(num2, 5, 3, 4, 4, 5);
        System.out.println(CollectionsAssignment.inEither(num1,num2));

         // inBoth test
        System.out.println(CollectionsAssignment.inBoth(num1,num2));
        
        // mostFrequent test
        String[] names = {"Bob", "Alice", "Bob"};
        List<String> namesList = Arrays.asList(names);
        List<String> namesList2 = Collections.emptyList();

        System.out.println(CollectionsAssignment.mostFrequent(namesList));
        System.out.println(CollectionsAssignment.mostFrequent(namesList2));

    }
}
