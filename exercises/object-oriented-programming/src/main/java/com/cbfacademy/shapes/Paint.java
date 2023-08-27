package com.cbfacademy.shapes;

public class Paint {
    double coverage = 10; //10 sqft per gallon

     // constructor
    public Paint (double coverage) {
        this.coverage = coverage;
    }

    // method computes paintGallon
    public double amount(Shape shape) {  // takes an object of the class shape as an argument
        double area = shape.area();
        double paintGallon = area * coverage;
        return paintGallon;
    }
}
