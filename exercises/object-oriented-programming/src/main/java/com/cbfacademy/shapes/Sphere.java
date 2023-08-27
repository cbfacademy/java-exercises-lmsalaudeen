package com.cbfacademy.shapes;
import java.lang.Math;

public class Sphere extends Shape {
    public double radius;

    public Sphere (double radius) {
    super ("sphere");
    this.radius = radius;
    }
   
    public double area() {
        return 4 * Math.PI * Math.pow(radius, radius);
    }
}
