package com.kodilla.collections.interfaces;

public class Triangle implements Shape {

    public double width; //szerokość podstawy
    public double hight; //wysokość
    public double hypotenuse; //dł. przeciwprostokątnej, trójkąt prostokątny - dla uproszczenia

    public Triangle(double width, double hight, double hypotenuse){
        this.width = width;
        this.hight = hight;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return width*hight/2;
    }

    @Override
    public double getPerimeter() {
        return width+hight+hypotenuse;
    }
}
