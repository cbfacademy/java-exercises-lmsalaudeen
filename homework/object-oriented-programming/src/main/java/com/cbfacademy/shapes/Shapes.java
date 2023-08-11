package com.cbfacademy.shapes;

public class Shapes {
    // public Enclosure shape;

    // public Shapes(Enclosure shape) {
    //     this.shape = shape;
    // };

    public static void computeArea(Enclosure[] shapes) {
        for (Enclosure shape:shapes) {
            System.out.println("The area of "+ shape +" is "+shape.area()); // is there a way to get it to print the name of the variable?
        }
    };

    public static void computePerimeter(Enclosure[] shapes) {
        for (Enclosure shape:shapes) {
            System.out.println("The perimeter of "+ shape +" is "+shape.perimeter());
        }
    }

}
