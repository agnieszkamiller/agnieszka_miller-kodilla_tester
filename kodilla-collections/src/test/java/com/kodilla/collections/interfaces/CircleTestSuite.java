package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTestSuite {

    @Test
    public void shouldGetAreaIfDimAEqualsZero() {
        //Given
        Circle circle = new Circle(0);
        //When
        //Then
        Assertions.assertEquals(0, circle.getArea());
    }
    @Test
    public void shouldGetAreaIfDimABelowZero(){
        //Given
        Circle circle = new Circle(-1);
        //When
        //Then
        assertEquals(3.141592653589793, circle.getArea());
    }

    @Test
    public void shouldGetAreaIfDimAAboveZero(){
        //Given
        Circle circle = new Circle(1);
        //When
        //Then
        assertEquals(3.141592653589793, circle.getArea());
    }

    @Test
    public void shouldGetPerimeterIfDimAEqualsZero(){
        //Given
        Circle circle = new Circle(0);
        //When
        //Then
        assertEquals(0, circle.getPerimeter());
    }

    @Test
    public void shouldGetPerimeterIfDimABelowZero(){
        //Given
        Circle circle = new Circle(-1);
        //When
        //Then
        assertEquals(-6.283185307179586, circle.getPerimeter());
    }

    @Test
    public void shouldGetPerimeterIfDimAAboveZero(){
        //Given
        Circle circle = new Circle(1);
        //When
        //Then
        assertEquals(6.283185307179586, circle.getPerimeter());
    }

    @Test
    public void shouldEqualsHashCodeAndToStrongWork(){
        //Given
        Circle circle = new Circle(1);
        //When
        //Then
        circle.equals(1);
        circle.hashCode();
        circle.toString();
    }


}