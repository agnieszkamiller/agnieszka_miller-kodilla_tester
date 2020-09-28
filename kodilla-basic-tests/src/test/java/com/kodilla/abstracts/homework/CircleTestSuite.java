package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTestSuite {

    @Test
    public void shouldCalculateAreaIfDimAEqualsZero(){
        //Given
        Circle circle = new Circle(0);
        //When
        //Then
        assertEquals(0, circle.calculateArea());
    }

    @Test
    public void shouldCalculateAreaIfDimABelowZero(){
        //Given
        Circle circle = new Circle(-1);
        //When
        //Then
        assertEquals(3.1415927, circle.calculateArea());
    }

    @Test
    public void shouldCalculateAreaIfDimAAboveZero(){
        //Given
        Circle circle = new Circle(1);
        //When
        //Then
        assertEquals(3.1415927, circle.calculateArea());
    }

    @Test
    public void shouldCalculatePerimeterIfDimAEqualsZero(){
        //Given
        Circle circle = new Circle(0);
        //When
        //Then
        assertEquals(0, circle.calculatePerimeter());
    }

    @Test
    public void shouldCalculatePerimeterIfDimABelowZero(){
        //Given
        Circle circle = new Circle(-1);
        //When
        //Then
        assertEquals(-6.2831854, circle.calculatePerimeter());
    }

    @Test
    public void shouldCalculatePerimeterIfDimAAboveZero(){
        //Given
        Circle circle = new Circle(1);
        //When
        //Then
        assertEquals(6.2831854, circle.calculatePerimeter());
    }

}