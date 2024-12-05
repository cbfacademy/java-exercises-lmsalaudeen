package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;



public class CollectionsAssignment {

    /**
     * This method removes all values from the provided list that are smaller
     * than the indicated integer. The remaining elements retain their original
     * ordering.
     *
     * @param list   - the list of integers
     * @param minValue the minimum value to retain
     */
    public static void removeSmallInts(List<Integer> list, int minValue) {
        // Your solution must traverse the list from last to first element
        // removing any values less than minValue.
        ListIterator<Integer> listIterator = list.listIterator(); //ListIterator can move forwards and backwards
        // while (listIterator.hasPrevious()) {  //why is hasPrevious not working?
        //     if (listIterator.previous() < minValue) {
        //         listIterator.remove();
        //     }
        // }
        
        while (listIterator.hasNext()) {  
            if (listIterator.next() < minValue) {
                listIterator.remove();
            }
        } 
    }
    

    /**
     * This method returns true if the provided collection contains any
     * duplicate elements.
     *
     * @param integers - a collection of integers
     * @return true if integers contains duplicates, false otherwise
     */
    public static boolean containsDuplicates(Collection<Integer> integers) {
        // Your solution must not use any loops.
        Set<Integer> setIntegers = new HashSet<>(integers);  
        // a hashset doesn't take duplicate items, if integers contains duplicate, the duplicate won't be added to the set
        if (setIntegers.size() < integers.size()) { //contains duplicates
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * either of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order.
     * <p>
     * For example, if the two arguments contain {2, 1, 2, 3} and {3, 4, 4, 5},
     * the returned ArrayList will contain {1, 2, 3, 4, 5}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return A sorted ArrayList containing the integers that appear in either
     * collection.
     */
    public static ArrayList<Integer> inEither(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        Set<Integer> list = new TreeSet<>(ints1);
        list.addAll(ints2); 
        return new ArrayList<Integer>(list);
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * both of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order. For example, if the two arguments contain {2, 1, 2, 3} and
     * {3, 4, 4, 5}, the returned ArrayList will contain {3}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return An ArrayList containing the integers that appear in both
     * collections.
     */
    public static ArrayList<Integer> inBoth(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        Set<Integer> instance1 = new HashSet<>(ints1);
        Set<Integer> instance2 = new HashSet<>(ints2);
        instance1.retainAll(instance2);  //How to use intersection?
        return new ArrayList<>(instance1);
    }

    /**
     * This method returns the String that appears most frequently in the
     * provided list. For example, if the input list contains the elements
     * {"Bob", "Alice", "Bob"}, this method will return "Bob". If there are
     * ties, any of the most frequently occurring elements may be returned.
     * If the list is empty, return the empty string "".
     *
     * @param list - a list of Strings
     * @return the most frequently occurring String
     */
    public static String mostFrequent(List<String> list) {
        // You should solve this problem in two stages: First iterate through
        // the list to count occurrences of each String. Then iterate through
        // your counts to find the largest. You'll need a collection that allows
        // you to store a mapping from Strings to counts.
        // No nested loops or non-enhanced for-loops are allowed.
        String frequent = "";  // couldn't just use return statement in the if/else block //but strings are immutable?
        if (list == Collections.<String>emptyList()) {
            frequent = "empty list";
        } else {
            Map<String, Integer> elementCounter = new HashMap<>();
                for(String Key: list) {
                    int Value = Collections.frequency(list, Key);
                    elementCounter.put(Key, Value);
                }
                // go through the values and get the max
                int max = 0;
                for (int value: elementCounter.values()) {
                    if (value>max) {
                        max = value;
                    }
                }
                // for key, value in the map
                for(Entry<String, Integer> entry: elementCounter.entrySet()) {
                    if (entry.getValue() == max) {
                        frequent = entry.getKey();
                } 
            }
        }
        return frequent;
    }

    public static String getName() {
        return "Collections Assignment";
    }
}
