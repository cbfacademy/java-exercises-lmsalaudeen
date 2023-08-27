package com.cbfacademy;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        //an array of 8 integer elements
        // int[] integerArray = new int[8];
        int[] integerArray = {1,2,3,4,5,6,7,8};
        System.out.println(integerArray[4]);

        //an array of 12 float elements
        float[] floatArray = {1.0f,2.1f,3.2f,4.3f,5.4f,6.5f,7.6f,8.7f,9.8f,10.9f,11.0f,12.1f};
        System.out.println(floatArray[4]);

        //an array of 5 double elements
        double[] doubleArray = {1.1,2.1,3.1,4.1,5.1};
        System.out.println(doubleArray[4]);

        //an array of 6 boolean elements
        boolean[] booleanArray = {true,false,true,true,false,false};
        System.out.println(booleanArray[4]);

        // a multidimensional array with the 4 arrays above
        Object[][] multidimensionalArray = {{integerArray,floatArray, doubleArray,booleanArray}};
        System.out.println(multidimensionalArray);
    }
}

