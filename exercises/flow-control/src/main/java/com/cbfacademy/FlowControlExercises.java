package com.cbfacademy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        List<String> stringList = new ArrayList<>();
        
     
        for (int i = 0; i < numbers.size(); i++) {
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
            if (numbers.get(i) % 3 == 0 && numbers.get(i) % 5 == 0) {
                    stringList.add("FizzBuzz");
            }
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
            else if (numbers.get(i) % 3 == 0) {
                stringList.add("Fizz");
            }
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list   
            else if (numbers.get(i) % 5 == 0) {
                stringList.add("Buzz");
            }
        
        //  - it adds the element to the list in any other case
            else {stringList.add(Integer.toString(numbers.get(i)));
            }
        }
        //  - it returns the constructed list
        return stringList;
        //throw new RuntimeException("Not implemented");
    }

    public String whichMonth(Integer number) {
        String Month = new String();
        // TODO - Implement this method such that
        // a map of month integer and month string?
        Map<Integer,String> monthMap= new HashMap<>();
        monthMap.put(1, "January");
        monthMap.put(2, "February");
        monthMap.put(3, "March");
        monthMap.put(4, "April");
        monthMap.put(5, "May");
        monthMap.put(6, "June");
        monthMap.put(7, "July");
        monthMap.put(8, "August");
        monthMap.put(9, "September");
        monthMap.put(10, "October");
        monthMap.put(11, "November");
        monthMap.put(12, "December");
        //  - it returns the month corresponding to the input ${number}
        if (monthMap.containsKey(number)) {
            Month =  monthMap.get(number);
        } 
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        else { Month = "Invalid month number";
        }
        return Month;
        // throw new RuntimeException("Not implemented");
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        int calculatedSumOfEvens = 0;
        int calculatedSumOfOdds = 0;
        Map<String, Integer> Sums = new HashMap<>();
        // loop from 1 to 100
        for (int i = 1; i <= 100; i=i+2) {
            calculatedSumOfOdds = calculatedSumOfOdds+i;
        };
        // loop from 2 to 100
        for (int i = 2; i <= 100; i=i+2) {
            calculatedSumOfEvens = calculatedSumOfEvens+i;
        };
        // put sums in map
        Sums.put("SumOfEvens", calculatedSumOfEvens);
        Sums.put("SumOfOdds", calculatedSumOfOdds);
        return Sums;
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        List<Integer> intReverse = new ArrayList<>();

        for (int i = numbers.size()-1; i >=0; i--) {
           intReverse.add(numbers.get(i));
        }
        return intReverse;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
