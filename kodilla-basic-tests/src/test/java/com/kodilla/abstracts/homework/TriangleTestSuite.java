package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTestSuite {

    @Test
    public void shouldCalculateAreaIfDimensionsAreZero(){
        //Given
        Triangle triangle = new Triangle(0,0,0,0);
        //When
        //Then
        assertEquals(0, triangle.calculateArea());
    }

    @Test
    public void shouldCalculateAreaIfDimensionsAreBelowZero(){
        //Given
        Triangle triangle = new Triangle(-1, -1,-1,-1);
        //When
        //Then
        assertEquals(0.5, triangle.calculateArea());
    }

    @Test
    public void shouldCalculateAreaIfDimAAboveZero(){
        //Given
        Triangle triangle = new Triangle(1,1,1,1);
        //When
        //Then
        assertEquals(0.5, triangle.calculateArea());
    }
    @Test
    public void shouldCalculatePerimeterIfDimAEqualsZero(){
        //Given
        Triangle triangle = new Triangle(0,0,0,0);
        //When
        //Then
        assertEquals(0, triangle.calculatePerimeter());
    }

    @Test
    public void shouldCalculatePerimeterIfDimABelowZero(){
        //Given
        Triangle triangle = new Triangle(-1,-1,-1,-1);
        //When
        //Then
        assertEquals(-3, triangle.calculatePerimeter());
    }

    @Test
    public void shouldCalculatePerimeterIfDimAAboveZero(){
        //Given
        Triangle triangle = new Triangle(1,1,1,1);
        //When
        //Then
        assertEquals(3, triangle.calculatePerimeter());
    }

}