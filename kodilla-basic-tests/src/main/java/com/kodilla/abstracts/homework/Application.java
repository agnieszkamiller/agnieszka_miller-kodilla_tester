package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        application.demonstrationApplication();
    }

    public void demonstrationApplication() {
        Square square = new Square(14);
        Triangle triangle = new Triangle(5, 7.5, 4, 10.7);
        Circle circle = new Circle(8);

        System.out.println("Sqare: area = " + square.calculateArea() + " and perimeter = "
                + square.calculatePerimeter() + ".");
        System.out.println("Triangle: area = " + triangle.calculateArea() + " and perimeter = "
                + triangle.calculatePerimeter() + ".");
        System.out.println("Circle: area = " + circle.calculateArea() + " and perimeter = "
                + circle.calculatePerimeter() + ".");
    }
}
