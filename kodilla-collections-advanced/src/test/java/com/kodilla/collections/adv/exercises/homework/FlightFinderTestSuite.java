package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    private FlightFinder flightFinder = new FlightFinder();

    @Test
    public void ifGivenDepartureDoesntExistCheckIfItAddToDepartureList(){
        //given
        //when
        List<Flight> departures = flightFinder.findFlightsFrom("Warszawa");
        //then
        assertEquals(0, departures.size());
    }
    @Test
    public void test2(){
        //given
        //when
        List<Flight> departures = flightFinder.findFlightsFrom("Amsterdam");
        //than
        assertNotEquals(0, departures.size());
    }

//    @Test

}