package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AudiTestSuite {

    @Test
    void getSpeed() {
        //Given
        Audi audi = new Audi();
        //When
        //Then
        audi.getSpeed();
    }

    @Test
    void increaseSpeed() {
        //Given
        Audi audi = new Audi();
        //When
        //Then
        audi.increaseSpeed();
    }

    @Test
    void decreaseSpeed() {
        //Given
        Audi audi = new Audi();
        //When
        //Then
        audi.decreaseSpeed();
    }
}