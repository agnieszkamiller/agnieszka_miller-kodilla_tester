package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightFinder {
    private List<Flight> flights = FlightRepository.getFlightsTable();

    public List<Flight> findFlightsFrom(String departure) { // metoda wyszukująca loty z
        List<Flight> resultFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getDeparture().equalsIgnoreCase(departure)) {
                resultFlights.add(flight);
            }
        }
        return resultFlights;
    }

    public List<Flight> findFlightsTo(String arrival) { // metoda wyszukująca loty do
        List<Flight> resultFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getArrival().equalsIgnoreCase(arrival)) {
                resultFlights.add(flight);
            }
        }
        return resultFlights;
    }
}
