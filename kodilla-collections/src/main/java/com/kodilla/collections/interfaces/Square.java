package com.kodilla.collections.interfaces;

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
}
