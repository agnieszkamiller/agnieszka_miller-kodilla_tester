package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    private static final double PI = 3.1415927;

    public Circle(double dimA) {
        super(dimA);
    }


    @Override
    public double calculateArea() {
        return Math.pow(getDimA(),2) * PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2  * PI * getDimA();
    }
}
