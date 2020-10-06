package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapeListApplication {

    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>(); //  utworzyliśmy zmienną shapes typu List<Square>,
        // a także przypisaliśmy do niej nową, pustą kolekcję w postaci obiektu klasy ArrayList
        Square sq1 = new Square(10); // tworzę trzy obiekty
        Square sq2 = new Square(5);
        shapes.add(sq1);                    // dodaje je do kolekcji
        shapes.add(sq2);
        shapes.add(new Square(1)); //jednoczesnie tworze obiekt i dodaje do kolekcji

        for (int n = 0; n < shapes.size(); n++) {
            Square square = shapes.get(n);
            if (square.getArea() > 20)
                System.out.println(square + "area" + square.getArea());
        }
    }

}
