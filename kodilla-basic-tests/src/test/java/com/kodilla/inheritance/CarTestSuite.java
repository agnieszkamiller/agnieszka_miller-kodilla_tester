package com.kodilla.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTestSuite {
    private Car car = new Car(4,2);

    @Test
    public void shouldTurnOnLights() {
        //Given
        Car car = new Car(4,4);
        //When
        //Then
        car.turnOnLights();
    }

    @Test
    public void shouldOpenDoors() {
        //Given
        Car car = new Car(4,4);
        //When
        //Then
        car.openDoors();
    }

    @Test
    public void shouldGetNumberOfWheels() {
        //Given
        //When
        //Then
        Assertions.assertEquals(4, car.getWheels());
    }

    @Test
    public void shouldGetNumberOfSeats() {
        //Given
        //When
        //Then
        Assertions.assertEquals(2, car.getSeats());
    }

    @Test
    public void displayNumberOfSeats() {
        //Given
        //When
        //Then
       // Assertions.assertEquals("Number of seats: 2", car.displayNumberOfSeats());
    }
}