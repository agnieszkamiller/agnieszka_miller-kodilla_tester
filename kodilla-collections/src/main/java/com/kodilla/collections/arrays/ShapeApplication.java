package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.Random;

public class ShapeApplication {

    public static void main(String[] args) {
   //     Shape[] shapes = new Shape[5];//tworzymy pusta tablicę dla 5 elementów
        Random random = new Random(); // tworzymy pusta tablicę dla losowej ilosci figur w zakresie 1-20
        Shape[] shapes = new Shape[random.nextInt(20)+1];
        System.out.println(shapes.length);

        for (int n = 0; n < shapes.length; n++) // Za pomocą pętli for wywołajmy metodę drawShape tyle razy, ile elementów będzie w tablicy
            shapes[n] = drawShape();
        for (Shape shape : shapes)        //wykonaj operację dla każdego elementu tablicy shapes
            ShapeUtils.displayShapeInfo((shape));
    }

    private static Shape drawShape() {
        Random random = new Random();
                int drawnShapeKind = random.nextInt(3); // możliwe wartości: 0(daje koło),1(kwadrat),2(trójkąt)
        double a = random.nextDouble() * 100 + 1; // możliwe wartości 1-100.999 dla wymiarów  figury, która wcześniej wylosowano
        double b = random.nextDouble() * 100 + 1;
        double c = random.nextDouble() * 100 + 1;
        if (drawnShapeKind == 0)
            return new Circle(a);
        else if (drawnShapeKind == 1)
            return new Square(a);
        else
            return new Triangle(a, b, c);
    }
}
