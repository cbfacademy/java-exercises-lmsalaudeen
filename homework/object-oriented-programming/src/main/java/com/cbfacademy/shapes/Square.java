package com.cbfacademy.shapes;

public class Square implements Enclosure{
    double width;

    // constructor
    public Square (double width) {
        this.width = width;
    }

    @Override
    public double perimeter() {
        return 4*width;
        
    }

    @Override
    public double area() {
        return width*width;
    }
    
}
