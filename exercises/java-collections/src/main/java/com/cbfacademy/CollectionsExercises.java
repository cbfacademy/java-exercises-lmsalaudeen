package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        LinkedList<Integer> someNumbers = new LinkedList<>();
        //  - add 4 as the first element of the list
        someNumbers.add(4);
        //  - then add 5, 6, 8, 2, 9 to the the list
        someNumbers.add(5);
        someNumbers.add(6);
        someNumbers.add(8);
        someNumbers.add(2);
        someNumbers.add(9);
        //  - add another 2 as the last element of the list
        someNumbers.add(2);
        //  - add 4 as the 3rd element of the list
        someNumbers.add(2, 4);
        //  - invoke the method element() on the list and print the result on the screen
        int value = someNumbers.element();
        System.out.println(value);
        //  - return the list
        return someNumbers;
        // throw new RuntimeException("Not implemented");
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        Stack<Integer> stackNumbers = new Stack<>();
        //  - add 5, 6, 8, 9 to the the stack
        stackNumbers.push(5);
        stackNumbers.push(6);
        stackNumbers.push(8);
        stackNumbers.push(9);
        //  - print the first element of the stack on the screen
        System.out.print(stackNumbers.elementAt(0));
        //  - print the last element of the stack on the screen
        System.out.print(stackNumbers.lastElement());
        //  - invoke the method pop() on the stack and print the result on the screen
        System.out.print(stackNumbers.pop());
        //  - invoke the push(4) method on the stack
        stackNumbers.push(4);
        //  - return the stack
        return stackNumbers;
        // throw new RuntimeException("Not implemented");
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        ArrayDeque<Integer> dequeNumbers = new ArrayDeque<>();
        //  - add 5, 6, 8, 9 to the the stack
        //int[] numList = {1,2,3,4};
        // dequeNumbers.add(numList);
        dequeNumbers.add(5);
        dequeNumbers.add(6);
        dequeNumbers.add(8);
        dequeNumbers.add(9);
        //  - print the first element of the queue on the screen
        System.out.print(dequeNumbers.element());
        //  - print the last element of the queue on the screen
        System.out.print(dequeNumbers.getLast());
        //  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(dequeNumbers.poll());
        //  - invoke the element() method on the queue and print the result on the screen
        System.out.print(dequeNumbers.element());
        //  - return the queue
        return dequeNumbers;
        //throw new RuntimeException("Not implemented");
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        HashMap<Integer,String> dictionary = new HashMap<>();
        //  - add {1, TypeScript} entry to the map
        dictionary.put(1, "TypeScript");
        //  - add {2, Kotlin} entry to the map
        dictionary.put(2, "Kotlin");
        //  - add {3, Python} entry to the map
        dictionary.put(3, "Python");
        //  - add {4, Java} entry to the map
        dictionary.put(4, "Java");
        //  - add {5, JavaScript} entry to the map
        dictionary.put(5, "JavaScript");
        //  - add {6, Rust} entry to the map
        dictionary.put(6, "Rust");
        //  - determine the set of keys from the map and print it on the screen
        System.out.print(dictionary.keySet());
        //  - determine the set of keys from the map and print it on the screen
        System.out.print(dictionary.values());
        //  - determine whether the map contains "English" as a language and print the result on the screen
        System.out.print(dictionary.containsValue("English"));
        //  - return the map
        return dictionary;
        // throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Collections Exercises";
    }
}
