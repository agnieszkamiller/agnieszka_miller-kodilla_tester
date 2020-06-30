package com.kodilla.abstracts.homework;

public abstract class Shape {
    private double dimA;
    private double dimB;
    private double dimC;
    private double dimD;

// przeciążanie konstruktorów
    // przeciążanie metody
    public Shape(double dimA) {
        this.dimA = dimA;
    }

    public Shape(double dimA, double dimB) {
        this.dimA = dimA;
        this.dimB = dimB;
    }

    public Shape (double dimA, double dimB, double dimC, double dimD) {
        this.dimA = dimA;
        this.dimB = dimB;
        this.dimC = dimC;
        this.dimD = dimD;
    }


    //    private double sside;
//    private double tside;
//    private double radius;
//
//    public void squareSide  (double sside) {
//        this.sside = sside;
//    }
//
//    public void trianleSide  (double tside)  {
//        this.tside = tside;
//    }
//
//    public void Circle (double radius) {
//        this.radius =  radius;
//    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();


    public double getDimA() {
        return dimA;
    }

    public double getDimB() {
        return dimB;
    }

    public double getDimC() {
        return dimC;
    }

    public double getDimD() {
        return dimD;
    }
}
