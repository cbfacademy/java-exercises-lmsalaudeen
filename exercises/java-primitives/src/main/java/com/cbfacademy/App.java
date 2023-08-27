package com.cbfacademy;

public class App {
    public static void main(String[] args ) {
        System.out.println( "Hello World!" );
        float float1 = 12f;
        float float2 = 20f;
        double double1 = 12d;
        double double2 = 20d;
        int int1 = 10;
        int int2 = 20;
        ArithmeticExercises exercises = new ArithmeticExercises();

        System.out.println(exercises.Multiply(float1,float2));
        System.out.println(exercises.Divide(double1,double2));
        System.out.println(exercises.Minus(int1,int2));

        // String name = "anna";

        // System.out.println(name);

        // boolean palindrome = false;
        
        // String wordReverse = "";
        // for (int i = name.length()-1; i >=0; i--) {
        //     wordReverse = wordReverse + name.charAt(i);
        // }
        // if (wordReverse.contentEquals(name)) {
        //     palindrome = true;
        // }
        // System.out.println(palindrome);
        // System.out.println(wordReverse);
    }
    
}
