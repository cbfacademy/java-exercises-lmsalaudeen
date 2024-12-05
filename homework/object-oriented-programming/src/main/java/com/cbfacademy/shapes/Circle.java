package com.cbfacademy.shapes;

public class Circle implements Enclosure{
    // a circle is defined with its radius
    double radius;

    // constructor
    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
        
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
    
}
