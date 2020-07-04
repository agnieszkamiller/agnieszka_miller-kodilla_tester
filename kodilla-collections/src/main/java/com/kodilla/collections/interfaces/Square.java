package com.kodilla.collections.interfaces;

import java.util.Objects;

public class Square implements Shape {

    public double width; //jedno pole(włąsciwość)

    public Square( double width){
        this.width = width;
    }//konstruktor inicjalizujący pole

    public double getArea(){
        return width*width;
    } //metoda obliczająca pole

    public double getPerimeter(){
        return 4*width;
    } //metoda obliczająca obwód

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width);
    }
}
