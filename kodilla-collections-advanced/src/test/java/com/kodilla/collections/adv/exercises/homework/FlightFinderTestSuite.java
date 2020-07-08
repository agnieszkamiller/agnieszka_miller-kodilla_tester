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
    public void ifGivenDepartureExistsCheckIfItAddToDepartureList(){
        //given
        //when
        List<Flight> departures = flightFinder.findFlightsFrom("Amsterdam");
        //than
        assertNotEquals(0, departures.size());
    }

    @Test
    public void ifGivenDepartureExistsCheckIfItAddCorrectlyToDepartureList(){
        //given
        //when
        List<Flight> departures = flightFinder.findFlightsFrom("Amsterdam");
        //than
        assertEquals(3, departures.size());
    }

    @Test
    public void ifGivenArrivalDoesntExistCheckIfItAddToDepartureList(){
        //given
        //when
        List<Flight> arrivals = flightFinder.findFlightsTo("Warszawa");
        //then
        assertEquals(0, arrivals.size());
    }
    @Test
    public void ifGivenArrivalExistsCheckIfItAddToDepartureList(){
        //given
        //when
        List<Flight> arrivals = flightFinder.findFlightsTo("Paryż");
        //than
        assertNotEquals(0, arrivals.size());
    }

    @Test
    public void ifGivenArrivalExistsCheckIfItAddCorrectlyToDepartureList(){
        //given
        //when
        List<Flight> arrivals = flightFinder.findFlightsTo("Paryż");
        //than
        assertEquals(2, arrivals.size());
    }
}