package com.kodilla.collections.interfaces;

public class InterfacesDemo {

    public static void main(String[] args) {
        Shape square = new Square(10);//tworzenie obiektu klasy square
        showShapeDetails(square);

        Shape circle = new Circle(7);
        showShapeDetails(circle);

        Shape triangle = new Triangle(6,4,7.211);
        showShapeDetails(triangle);
    }

//    private static void showSquareDetails(Square square){
//        System.out.println(square.getArea()); //wywołanie metody getArea z klasy Square
//        System.out.println(square.getPerimeter());
//    }
//    private static void showCircleDetails(Circle circle){
//        System.out.println(circle.getArea());
//        System.out.println(circle.getPerimeter());
//    }
//    private static void showTriangleDetails(Triangle triangle){
//        System.out.println(triangle.getArea());
//        System.out.println(triangle.getPerimeter());
//    }

    private static void showShapeDetails(Shape shape) {
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}
