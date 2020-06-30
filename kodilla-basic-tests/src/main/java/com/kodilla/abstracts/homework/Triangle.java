package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private static final double DIVIDER = 0.5;

    public Triangle(double dimA, double dimB, double dimC, double dimD) {
        super(dimA, dimB, dimC, dimD);
    }


    @Override
    public double calculateArea() {
        return DIVIDER * getDimA() * getDimB();
    }

    @Override
    public double calculatePerimeter() {
        return getDimA() + getDimC() + getDimD();
    }
}
