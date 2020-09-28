package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTestSuite {

    @Test
    public void areaShouldBeZero() {
        Shape shape = Mockito.mock(Shape.class);

        Assertions.assertEquals(0, shape.calculateArea());
    }

}