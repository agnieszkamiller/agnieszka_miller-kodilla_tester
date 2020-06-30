package com.kodilla.abstracts.homework;

public class Square extends Shape {


    public Square(double dimA) {
        super(dimA);
    }

    @Override
    public double calculateArea() {
        return Math.pow(getDimA(), 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * getDimA();
    }
}
