package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTestSuite {

    @Test
    public void shouldCalculateAreaIfDimAEqualsZero(){
        //Given
        Square square = new Square(0);
        //When
        //Then
        assertEquals(0, square.calculateArea());
    }

    @Test
    public void shouldCalculateAreaIfDimABelowZero(){
        //Given
        Square square = new Square(-1);
        //When
        //Then
        assertEquals(1, square.calculateArea());
    }

    @Test
    public void shouldCalculateAreaIfDimAAboveZero(){
        //Given
        Square square = new Square(1);
        //When
        //Then
        assertEquals(1, square.calculateArea());
    }
    @Test
    public void shouldCalculatePerimeterIfDimAEqualsZero(){
        //Given
        Square square = new Square(0);
        //When
        //Then
        assertEquals(0, square.calculatePerimeter());
    }

    @Test
    public void shouldCalculatePerimeterIfDimABelowZero(){
        //Given
        Square square = new Square(-1);
        //When
        //Then
        assertEquals(-4, square.calculatePerimeter());
    }

    @Test
    public void shouldCalculatePerimeterIfDimAAboveZero(){
        //Given
        Square square = new Square(1);
        //When
        //Then
        assertEquals(4, square.calculatePerimeter());
    }
}