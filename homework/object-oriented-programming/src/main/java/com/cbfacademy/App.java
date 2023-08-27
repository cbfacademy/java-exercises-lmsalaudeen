package com.cbfacademy;


import com.cbfacademy.shapes.Circle;
import com.cbfacademy.shapes.Enclosure;
import com.cbfacademy.shapes.Shapes;
import com.cbfacademy.shapes.Square;
import com.cbfacademy.words.ReverseCharSequence;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // ReverseCharSequence name = new ReverseCharSequence("Lat");
        // System.out.println(name.subSequence(0,3));

        // System.out.println(ReverseCharSequence.reverseChar("Latifah"));


        Square square1 = new Square(20);
        Square square2 = new Square(4);
        Square square3 = new Square(12);

        Circle circle1 = new Circle(12);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(5);
        
        Enclosure[] shapesList= {square1, square2, square3, circle1, circle2, circle3};

        // System.out.println(circle1.perimeter());
        // System.out.println(square1.area());
        Shapes.computeArea(shapesList);
    }
}
