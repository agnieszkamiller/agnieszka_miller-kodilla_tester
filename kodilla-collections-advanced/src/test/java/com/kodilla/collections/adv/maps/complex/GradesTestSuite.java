package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GradesTestSuite {

    @Test
    public void shouldGetGrades() {
//        Grades grades = new Grades();

    }

    @Test
    public void shouldGetAverageOfGrades() {
        //Given
        Grades grades1 = new Grades(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Grades grades2 = new Grades(1, 1, 1, 1, 1, 1);
        Grades grades3 = new Grades(-1, -1, -1, -1, -1, -1);
        //When
       //Then
        Assertions.assertEquals(0, grades1.getAverage());
        Assertions.assertEquals(1, grades2.getAverage());
        Assertions.assertEquals(-1, grades3.getAverage());
    }

}