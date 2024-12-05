package com.cbfacademy.shapes;

public class ShapeTest {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    
        Shape sphere1 = new Sphere(1);
        System.out.println(sphere1);
        System.out.println(sphere1.area());

        Shape rectangle1 = new Rectangle(4.0, 4.0);
        System.out.println(rectangle1);
        System.out.println(rectangle1.area());
}
}