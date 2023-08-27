package com.cbfacademy.shapes;

public abstract class Shape {
    String shapeName;
    // constructor
    public Shape (String shapeName) {
        this.shapeName = shapeName;
    }

    // abstract method
    public abstract double area();
    
    // toString method
    public String toString() {
        return shapeName;
    }
}
